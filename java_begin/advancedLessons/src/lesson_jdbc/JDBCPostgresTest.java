package lesson_jdbc;

import java.sql.*;

public class JDBCPostgresTest {
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "0000";

    public static void main(String[] args){
        Connection connection = null;
        System.out.println("Тестирование postgresql");
        try {
            //Загружаем драйвер
            Class.forName("org.postgresql.Driver");
            System.out.println("Драйвер подключен!");

            //Создаем соединение
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Соединение установлено");

            //Для использования SQL запросов существуют 3 типа объектов:
            //1.Statement: используется для простых случаев без параметров
            Statement statement = null;
            statement = connection.createStatement();

            //Выполним запрос
            ResultSet result1 =statement.executeQuery("SELECT * FROM rpv_table_test");

            //result это указатель на первую строку с выборки
            //чтобы вывести данные мы будем использовать
            //метод next() , с помощью которого переходим к следующему элементу
            System.out.println("Выводим statement");
            while (result1.next()){
                System.out.println("Номер в выборке № "+ result1.getRow()+ "\t Номер в таблице № " + result1.getInt("id")
                                    + "\t" + result1.getString("name") + "\t" + result1.getInt("value"));
            }

            //вставить запись так же и обновить
//            statement.executeUpdate("INSERT INTO rpv_table_test(id, name, value) values ('3','TR03', '300');");

            //2.PreparedStatement: предварительно компилирует запросы,
            //которые могут содержать входные параметры
            // Запрос с указанием мест для параметров в виде знака "?"
            String sql = "INSERT INTO rpv_table_test(id, name, value) values (?, ?, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            // Установка параметров
            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "TR04");
            preparedStatement.setInt(3, 0);
            // Выполнение запроса
//            preparedStatement.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

