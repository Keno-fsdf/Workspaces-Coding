import pyautogui
from pyautogui import*
from time import sleep
sleep(3)
keyDown('k')
keyDown("w") #pressing down key 'a'
sleep(1)
keyDown('capslock')
sleep(135) #how ever long you want
keyUp("w") #stop pressing key 'a' down
keyUp('capslock')
keyUp('k')
keyDown('e')
keyUp('e')
pyautogui.moveTo(x=1500, y=810)  #bewegt den curser zum stern 
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=968, y=405) #bewegt den curser zum craftingtable
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=760,y=930) # bewegt sich zu einem cobblestone(slot2) 
keyDown('shift')
pyautogui.click()
pyautogui.moveTo(x=830,y=918)
pyautogui.click()
pyautogui.moveTo(x=900,y=919)
pyautogui.click()
pyautogui.moveTo(x=970,y=919)
pyautogui.click()
pyautogui.moveTo(x=1050,y=918)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=1038,y=342)
pyautogui.click() #Das sind die ersten 2 enchantenten Cobblestone

pyautogui.moveTo(x=1115,y=918)
pyautogui.click() #1
pyautogui.moveTo(x=1188,y=918)
pyautogui.click() #2
pyautogui.moveTo(x=685,y=830) #1 slot in der 2 bar von unten
pyautogui.click() #3
pyautogui.moveTo(x=750,y=837)
pyautogui.click() #4
pyautogui.moveTo(x=825,y=825)
pyautogui.click() #5
pyautogui.moveTo(x=1038,y=342)
sleep(0.5)
pyautogui.click() #Das sind die ersten 4 enchanten Cobblestone

pyautogui.moveTo(x=902,y=825)
pyautogui.click() #1
pyautogui.moveTo(x=970,y=825)
pyautogui.click() #2
pyautogui.moveTo(x=1043,y=825)
pyautogui.click() #3
pyautogui.moveTo(x=1115,y=825)
pyautogui.click() #4
pyautogui.moveTo(x=1180,y=825)
pyautogui.click() #5
sleep(0.5)
pyautogui.moveTo(x=1038,y=342)
pyautogui.click() # 6 e cobblestone

pyautogui.moveTo(x=1264,y=825)  #hier waren die sleeps drin von 1 sekunde
pyautogui.click() #1
pyautogui.moveTo(x=750,y=680)
pyautogui.click() #2
pyautogui.moveTo(x=825,y=680)
pyautogui.click() #3
pyautogui.moveTo(x=897,y=680)
pyautogui.click() #4
pyautogui.moveTo(x=970,y=680)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=1038,y=342)
pyautogui.click() # 8 e cobblestone

pyautogui.moveTo(x=680,y=680)
pyautogui.click()                #Hier waren die sleeps auch drin
pyautogui.moveTo(x=1043,y=680)
pyautogui.click()
pyautogui.moveTo(x=1120,y=680)
pyautogui.click()
pyautogui.moveTo(x=1180,y=680)
pyautogui.click()
pyautogui.moveTo(x=1265,y=680)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=1038,y=342)
pyautogui.click()

pyautogui.moveTo(x=685,y=757)
pyautogui.click()
pyautogui.moveTo(x=755,y=760)
pyautogui.click()
pyautogui.moveTo(x=835,y=760)
pyautogui.click()
pyautogui.moveTo(x=900,y=760)
pyautogui.click()
pyautogui.moveTo(x=970,y=760)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=1038,y=342)
pyautogui.click()              #Das sind alle e Cobblestone die man von einem Inventar machen kann, jetzt bleiben noch 4 stacks normal über

pyautogui.moveTo(x=970,y=561)
pyautogui.click()                #Geht aus dem crafting table menu raus,
sleep(0.5)

keyUp('shift')  # Man muss shift loslassen um in die enderchest zu kommen

pyautogui.moveTo(x=1188,y=346)
pyautogui.click()                #Geht in die Enderchest
sleep(0.25)

keyDown('shift') # Hier aktiveren wir shift wieder

pyautogui.moveTo(x=1043,y=650)   #legt die 4 stags in die enderchest
pyautogui.click()
pyautogui.moveTo(x=1115,y=650)
pyautogui.click()
pyautogui.moveTo(x=1185,y=650)
pyautogui.click()
pyautogui.moveTo(x=1260,y=650)
pyautogui.click()

pyautogui.moveTo(x=750,y=808)
pyautogui.click()   #legt jedes restliche cobblestone in die enderchest

pyautogui.moveTo(x=825,y=808)
pyautogui.click() #legt das e cobblestone in die enderchest

keyDown('e')
keyUp('e')
keyUp('shift')

# jetzt muss man nur noch den Ablauf wiederholen
# das machen aber in einer anderen datei/script

