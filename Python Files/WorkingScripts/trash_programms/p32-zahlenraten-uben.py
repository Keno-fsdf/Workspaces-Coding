
import random


def uberpruf(zahl,guess):
    if zahl==guess:
        print ("Du hast die richtige Zahl eraten")
        (exit)
    elif zahl<guess:
        print ("Deine Zahl ist zu hoch")
    else:
        print ("Deine Zahl ist zu niedrig")
    

print ("Zahlenratespiel")

zahl=random.randint(1,2000)

print ("Die Zahl ist eine Zahl zwischen 1-100")

a="ja"
while a=="ja" or a=="Ja":
    guess=int.input("Rate") 
    uberpruf(zahl,guess)
    a=raw_input("Willst du nochmal raten(ja/nein)")
    