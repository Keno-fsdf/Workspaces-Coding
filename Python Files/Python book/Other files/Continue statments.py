while True:
    print("Who are you?")
    name = input()
    if name != "Joe":
        continue
    print("Hello, Joe what is your Password?(It is a fish)")
    password = input()
    if password =="swordfish":
        break
print("Acces granted")