import pyautogui
from pyautogui import*
from time import sleep
import time 
import multiprocessing

import pyautogui, time
from pynput.mouse import Button, Controller
from python_imagesearch.imagesearch import imagesearch_numLoop
mouse = Controller()


#def Seach_for_Image():



pos = imagesearch_numLoop(r"C:\Users\User\Desktop\Neon Instalook.png", 1, 50)
if pos[0] != -1:
    Place =print("position : ", pos[0], pos[1])
   
    pyautogui.click(pos[0],pos[1])
    
    pyautogui.click(pos[0],pos[1])
  
    pyautogui.click(x=886,y=799)

    pyautogui.rightClick()
     
    pyautogui.click()
   

else:
    print("image not found")
#Seach_for_Image()


