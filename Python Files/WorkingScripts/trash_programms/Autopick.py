
import pyautogui, time
from pynput.mouse import Button, Controller
from python_imagesearch.imagesearch import imagesearch_numLoop
mouse = Controller()

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

 




#time.sleep(2)
#while True:
 #   time.sleep(.1)
  #  if pyautogui.locateOnScreen(r'C:\Users\User\Pictures\test.PNG'):
   #    pyautogui.click(180,40)  
    #   break

#yautogui.sleep(0.5)

#pyautogui.moveTo(x=1500, y=810)  
#pyautogui.click()







#Coordinates = pyautogui.locateOnScreen(r'C:\Users\User\Desktop\Python Jett instalock.PNG',region=(0,0, 300, 400))
#print (Coordinates)
#pyautogui.click(Coordinates)
#pyautogui.moveTo(x=1500, y=810)  
#pyautogui.click()pip3 install python-imagesearch
