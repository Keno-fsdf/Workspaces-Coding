spam ={"color": "red","age":"42"}
for v in spam.values():
    print(v)


print("                                                         ")

for k in spam.keys():
    print(k)


print("                                                         ")

for i in spam.items():
    print(i)

print("                                                         ")

for k, v in spam.items():
    print("Key: "+ k + "Value: " + str(v))


#Checking Whether a Key or Value Exists in a Dictionary

print("age" in spam.keys())

print("red" in spam.values())

print("red" in spam) # i dont rly get why this is false


Items = {"apples": 5, "cups": 2}

print("I am bringing " + str(Items.get("cups",0)) + " cups.")

print("I am bringing " + str(Items.get("apples",0)) + " apples.")


spam = {'name': 'Pooka', 'age': 5}
print(spam)
if 'color' not in spam:
 spam['color'] = 'black'

print(spam)

print("")

spam.setdefault("Sir name","schuerger")
print(spam)

print("                                                         ")

print(spam.setdefault("Sir name","schuerger"))