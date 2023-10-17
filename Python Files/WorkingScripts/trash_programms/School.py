import os
import time
import winsound
import keyboard
from pyautogui import*
from time import sleep
Lernseasions =input("how many Lernseasion do you wanna do")
Lernseasions = int(Lernseasions)

print("clean your desk now, PRESS space when you are ready")
keyboard.wait("space")
print("select now your gmail for school and get a drink for school")
os.system(r"start https://mail.google.com/mail/u/0/#inbox")
print("press space when you are ready to start")
keyboard.wait("space")
os.system(r"start https://www.youtube.com/watch?v=WPni755-Krg&t=2263s")
time.sleep(1)


Zähler = 0
while Lernseasions > Zähler: 
    print("Die erste / nächste Lernseason startet jetzt")
    time.sleep(1620)
    time.sleep(1)
    winsound.PlaySound("SystemExit", winsound.SND_ALIAS)
    time.sleep(0.5)
    winsound.PlaySound("SystemExit", winsound.SND_ALIAS)
    winsound.PlaySound("SystemExit", winsound.SND_ALIAS)
    winsound.PlaySound("SystemExit", winsound.SND_ALIAS)
    os.system(r"start https://www.youtube.com/results?search_query=musik")
    time.sleep(300)
    winsound.PlaySound("SystemExit", winsound.SND_ALIAS)
    winsound.PlaySound("SystemExit", winsound.SND_ALIAS)
    print('Pause ist vorbei')
    print("schließe bitte jetzt das musik fenster")
    time.sleep(15)
    Zähler = Zähler + 1




#keyboard.press("strg + w")

    	

