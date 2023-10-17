import keyboard
import time
import random as r

import pyautogui
from pyautogui import*
from time import sleep
 
sleep(5)
# F = open(r"C:\Users\User\Desktop\Wichtig_Python_Files\Brudeforce.txt" ,"r+")
F = open(r"C:\Users\User\Desktop\bruteforce 1 million.txt" ,"r+")
 
Cont = F.readlines()
 
 
I = 0
Co = 0
slep = r.randrange(1,2)
print (Cont)


 
while I < len(Cont):
    keyboard.write(Cont[Co])
    keyboard.press("enter")
    time.sleep(0.000000001)
    keyboard.press("strg + a")
    keyboard.press("return")
    #time.sleep(1)
    Co = Co +1
    I = I+1






