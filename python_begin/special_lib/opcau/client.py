from opcua import ua, Server, Client
import xml.etree.ElementTree as ET

def config(config_file='config.xml'):
    tree = ET.parse(config_file)
    root = tree.getroot()
    result = {}
    for element in root:
        result[element.tag] = element.text
    return result


config=config()

annihilator = Client(config['UA_HOST'])

objects = annihilator.get_objects_node()
print(objects.add_folder())

print(objects)
# print(folder)



