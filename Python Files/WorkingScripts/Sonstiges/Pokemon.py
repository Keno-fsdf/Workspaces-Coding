import pyautogui
from pyautogui import*
from time import sleep
import time 
import multiprocessing
from multiprocessing import shared_memory 
import pyautogui, time
from pynput.mouse import Button, Controller
from python_imagesearch.imagesearch import imagesearch_numLoop
import sys
mouse = Controller()


#sleep(3)
#keyDown('k')
#keyDown("w") #pressing down key 'a'
#sleep(1)
#keyDown('capslock')
#sleep(135) #how ever long you want
#keyUp("w") #stop pressing key 'a' down
#keyUp('capslock')
#keyUp('k')
#keyDown('e')
#keyUp('e')
#pyautogui.moveTo(x=1500, y=810)  #bewegt den curser zum stern 
#pyautogui.click()
#sleep(0.5)
#pyautogui.moveTo(x=968, y=405) #bewegt den curser zum craftingtable
#pyautogui.click()
#sleep(0.5)
#pyautogui.moveTo(x=760,y=930) # bewegt sich zu einem cobblestone(slot2) 
#keyDown('shift')
#pyautogui.click()
#pyautogui.moveTo(x=830,y=918)
#pyautogui.click()
#pyautogui.moveTo(x=900,y=919)
#pyautogui.click()
#pyautogui.moveTo(x=970,y=919)
#pyautogui.click()
#pyautogui.moveTo(x=1050,y=918)
#pyautogui.click()
#sleep(0.5)
#pyautogui.moveTo(x=1038,y=342)
#pyautogui.click() #Das sind die ersten 2 enchantenten Cobblestone 
#Programm_Ende = multiprocessing.Manager

#manager = multiprocessing.Manager
 
Programm_Ende = False
Programm_Ende = False
Anzahl_Der_Multiplikation = 10
#Programm_Ende = shared_memory.SharedMemory(create=True, size=10)
#print (type(Programm_Ende.buf))
def Programm (Anzahl_der_Programm_Läufe_T):    
             #Hier gibst du ein Wie häufig das Programm laufen soll -->es wird mit Anzahl der Multiplikation multipliziert 
        Anzahl_der_Programm_Läufe_T = Anzahl_der_Programm_Läufe_T * Anzahl_Der_Multiplikation
        while Anzahl_der_Programm_Läufe_T > 0:
            print ("Still running")
            time.sleep(1)  
            Anzahl_der_Programm_Läufe_T = Anzahl_der_Programm_Läufe_T - 1
        if Anzahl_der_Programm_Läufe_T == 0:
             Programm_Ende = True
             print (Programm_Ende)
             #Programm_Ende.close() 
             SystemExit
        
         


        
def Search_for_Image():
    
    while 1 == 1:
        

        if Programm_Ende ==True:
                #Programm_Ende.close() 
                quit()
        if Programm_Ende ==False:
            pos = imagesearch_numLoop(r"C:\Users\User\Desktop\Testsfsfsfd.png", 1, 2)
            if pos[0] != -1:
                Place =print("position : ", pos[0], pos[1])
                print ("Pokemon found!!!")
                #Programm_Ende.close() 
                quit()
        
   


    


P1 = multiprocessing.Process(target=Programm,args=[1])
P2 = multiprocessing.Process(target=Search_for_Image)
#Programm(10)

#print ("ich bin cool")


if __name__ == '__main__':
    P1.start()
    P2.start()
    P1.join ()
    P2.join ()

finish = time.perf_counter()
print("Finished runninger after : ", finish)






# pos = imagesearch_numLoop(r"C:\Users\User\Desktop\Smileytest.png", 1, 50)
# if pos[0] != -1:
         #           Place =print("position : ", pos[0], pos[1])

    
    #print ("Programm is done")

#Programm_run_time(10)


#Programm1 = multiprocessing.Process(target=Programm_run_time,args=[1])
#Programm2 = multiprocessing.Process(target=Programm_run_time,args=[1])

#if __name__ == '__main__':
 #   Programm1.start()
   # Programm2.start()
  #  Programm1.join ()
    #Programm2.join ()

#finish = time.perf_counter()
#print("Finished runninger after : ", finish)





 
