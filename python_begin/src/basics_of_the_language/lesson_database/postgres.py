# import psycopg2
# from psycopg2 import Error
# from psycopg2.extensions import ISOLATION_LEVEL_AUTOCOMMIT
# try:
#     # Подключение к существующей базе данных
#     connection = psycopg2.connect(user="postgres",
#                                   # пароль, который указали при установке PostgreSQL
#                                   password="postgres",
#                                   host="127.0.0.1",
#                                   port="5432")
#     connection.set_isolation_level(ISOLATION_LEVEL_AUTOCOMMIT)
#     # Курсор для выполнения операций с базой данных
#     cursor = connection.cursor()
#     sql_create_database = 'create database python_database'
#     cursor.execute(sql_create_database)
# except (Exception, Error) as error:
#     print("Ошибка при работе с PostgreSQL", error)
# finally:
#     if connection:
#         cursor.close()
#         connection.close()
#         print("Соединение с PostgreSQL закрыто")

#____________________________________________________________________________________________________
import psycopg2
from psycopg2 import Error

try:
    # Подключение к существующей базе данных
    connection = psycopg2.connect(user="postgres",
                                  # пароль, который указали при установке PostgreSQL
                                  password="postgres",
                                  host="127.0.0.1",
                                  port="5432",
                                  database="python_database")

    # Курсор для выполнения операций с базой данных
    cursor = connection.cursor()
    # Распечатать сведения о PostgreSQL
    print("Информация о сервере PostgreSQL")
    print(connection.get_dsn_parameters(), "\n")
    # Выполнение SQL-запроса
    cursor.execute("SELECT version();")
    # Получить результат
    record = cursor.fetchone()
    print("Вы подключены к - ", record, "\n")


    create_table_query = '''CREATE TABLE mobile
                          (ID INT PRIMARY KEY     NOT NULL,
                          MODEL           TEXT    NOT NULL,
                          PRICE         REAL); '''
    # Выполнение команды: это создает новую таблицу
    cursor.execute(create_table_query)
    connection.commit()
    print("Таблица успешно создана в PostgreSQL")


    # Выполнение SQL-запроса для вставки данных в таблицу
    insert_query = """ INSERT INTO mobile (ID, MODEL, PRICE) VALUES (1, 'Iphone12', 1100)"""
    cursor.execute(insert_query)
    connection.commit()
    print("1 запись успешно вставлена")
    # Получить результат
    cursor.execute("SELECT * from mobile")
    record = cursor.fetchall()
    print("Результат", record)

    # Выполнение SQL-запроса для обновления таблицы
    update_query = """Update mobile set price = 1500 where id = 1"""
    cursor.execute(update_query)
    connection.commit()
    count = cursor.rowcount
    print(count, "Запись успешно удалена")
    # Получить результат
    cursor.execute("SELECT * from mobile")
    print("Результат", cursor.fetchall())

    # Выполнение SQL-запроса для удаления таблицы
    delete_query = """Delete from mobile where id = 1"""
    cursor.execute(delete_query)
    connection.commit()
    count = cursor.rowcount
    print(count, "Запись успешно удалена")
    # Получить результат
    cursor.execute("SELECT * from mobile")
    print("Результат", cursor.fetchall())

except (Exception, Error) as error:
    print("Ошибка при работе с PostgreSQL", error)
finally:
    if connection:
        cursor.close()
        connection.close()
        print("Соединение с PostgreSQL закрыто")
