import keyboard
import time
import random as r

import pyautogui
from pyautogui import*
from time import sleep
 
sleep(1)
F = open(r"C:\Users\User\Desktop\Wichtig_Python_Files\Song_Text_Spam.txt" ,"r+")
 
Cont = F.readlines()
 
 
I = 0
Co = 0
slep = r.randrange(1,2)


print (Cont)



 
while I < len(Cont):
   
    
    keyboard.write(Cont[Co])
    keyboard.press("enter")
    time.sleep(slep)
    Co = Co +1
    I = I+1