List = ["hi","whats up","welcome","howdy"]

Is_it_in_the_list  =  "howdy" in List
print(Is_it_in_the_list)

Is_it_not_in_the_list = "howdy" not in List 
print(Is_it_not_in_the_list)


myPets = ["Zophie","Pooka","Fat-tail"]
print("Enter a pet name")
name = input()
if name not in myPets:
    print(" i do not have a pet name"+ name)
else:
    print(name + " is my pet")