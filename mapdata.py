import xml.etree.ElementTree as etree

print("loading in streetmap")
tree = etree.parse("ottawamap.osm")
root = tree.getroot()



children = root.getchildren()
note, meta, bounds = children[0:3]


# <node id="4410766031" lat="45.4208882" lon="-75.7009299" version="1" timestamp="2016-09-21T01:42:26Z" changeset="42312153" uid="4505133" user="phcosm">
#     <tag k="amenity" v="fast_food"/>
#     <tag k="cuisine" v="burger"/>
#     <tag k="name" v="McDonald's"/>
#   </node>


starbucks = []
mcdonalds = []

import ipdb;

print("scanning nodes")
for idx, node in enumerate(children):
	if idx % 1000 == 0:
		print(idx)

	tags = node.getchildren()


	for tag in tags:

		attributes = tag.attrib
		
		if attributes.get('k') == 'name' and "starbuck" in attributes.get('v').lower():
			starbucks.append(node)
		elif attributes.get('k') == 'name' and "mcdonald" in attributes.get('v').lower():
			mcdonalds.append(node)

for n in starbucks:
	print(n.attrib)
	for n2 in n.getchildren():
		print(n2.attrib)
