from random import randint
import time
from opcua import ua, Server
import xml.etree.ElementTree as ET

def config(config_file='config.xml'):
    tree = ET.parse(config_file)
    root = tree.getroot()
    result = {}
    for element in root:
        result[element.tag] = element.text
    return result
config=config()
server = Server()
server.set_endpoint(config['UA_HOST'])
idx = server.register_namespace(config['UA_ROOT_NAMESPACE'])
object = server.get_objects_node()



myfolder = object.add_folder(idx, "myFolder") #создание в главноеой папки 
inside_folder = myfolder.add_folder(idx, "inside_folder") # подпапки
inside_inside_folder = inside_folder.add_folder(idx, 'new_foleder')

my_obj = object.add_object(idx, "myobj")#создание в главноеой папки 
inside_obj = my_obj.add_object(idx, "inside")# подпапки


#создание параметров
myvar1 = object.add_variable(idx, "Temp1", 0)
myvar2 = myfolder.add_variable(idx, "Temp2", 0)
myvar3 = inside_folder.add_variable(idx, "Temp3", 0)
myvar4 = inside_inside_folder.add_variable(idx, "Temp34", 0)
myvar5 = inside_obj.add_variable(idx, "Temp55", 0)


server.start()

while True:
    
    myvar1.set_value(randint(100, 500))
    myvar2.set_value(randint(100, 500))
    myvar3.set_value(randint(100, 500))
    myvar4.set_value(randint(100, 500))
    myvar5.set_value(randint(100, 500))


    time.sleep(2)