package lesson_jdbc;


import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.sql.*;


public class MethodDB {
    private static String DRIVER;
    private static String DB_URL;
    private static String USER;
    private static String PASS;

    public static void main(String[] args) {
        readConfig(new File("src/lesson_jdbc/config.xml"));
        MethodDB methodDB = new MethodDB();
        try {
            Class.forName(DRIVER);
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            methodDB.insert(connection, 5, "TVY001", 400);
            methodDB.select(connection);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readConfig(File file){
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        Document document = null;

        try{
            document = documentBuilderFactory.newDocumentBuilder().parse(file);

            Node root =document.getFirstChild();
            NodeList paramsNodes = root.getChildNodes();

            for (int i = 0; i < paramsNodes.getLength(); i++){
                switch (paramsNodes.item(i).getNodeName()){
                    case "DRIVER" -> DRIVER = paramsNodes.item(i).getTextContent();
                    case "DB_URL" -> DB_URL = paramsNodes.item(i).getTextContent();
                    case "USER" -> USER = paramsNodes.item(i).getTextContent();
                    case "PASS" -> PASS = paramsNodes.item(i).getTextContent();
                }
            }

            if (DB_URL.equals("") | USER.equals("") | PASS.equals("")){
                System.err.println("Отсутствуют необходимые параметры в конфигурационном файле config.xml");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void select(Connection connection) throws SQLException {
        String sql ="SELECT * FROM rpv_table_test";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            String answer  = resultSet.getString("id") +" : "+ resultSet.getString("name")+" : "+ resultSet.getString("value");
            System.out.println(answer);
        }
        resultSet.close();
        statement.close();
    }

    private void insert(Connection connection, int id, String name, int value) throws SQLException {
        String sql = "INSERT INTO rpv_table_test(id, name, value) VALUES(?, ? ,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        preparedStatement.setInt(3, value);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }


}
