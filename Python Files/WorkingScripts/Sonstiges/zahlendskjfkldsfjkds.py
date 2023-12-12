import  random
def Schönheit():
    Number = int(random.randrange(1, 6))

    while True:
        GuessZahle = int(input())

        if GuessZahle == Number:
            print("Richtige Zahl")
            break

        else:
            print("falsche Zahl")

            if GuessZahle <Number:
                print("höher")

            else: 
                print("niedriger")


Schönheit()




