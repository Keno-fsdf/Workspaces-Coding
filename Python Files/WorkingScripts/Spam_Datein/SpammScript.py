import pyautogui
from pyautogui import*
from time import sleep
import keyboard
import random



Spam = 0

sleep(3)
while Spam <25:
    WORDS = ("mach loss", "PLZ", "Beile dich mal", "Mach doch schneller", "Ich möchte zocken",  "Lass zocken")
    word = random.choice(WORDS)
    keyboard.write(word)
    keyDown('enter')
    keyUp('enter')
    Spam = Spam +1
    sleep(0.25)

