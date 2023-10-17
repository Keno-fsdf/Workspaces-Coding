import pyautogui
from pyautogui import*
from time import sleep
sleep(3)
keyDown('k')
keyDown("w") #pressing down key 'a'
sleep(1)
keyDown('capslock')
sleep(133) #how ever long you want
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

pyautogui.moveTo(x=825,y=808)
pyautogui.click() #legt das e cobblestone in die enderchest            #hab das untere mit dem oberen getauscht

pyautogui.moveTo(x=750,y=808)
pyautogui.click()   #legt jedes restliche cobblestone in die enderchest



keyDown('e')
keyUp('e')
keyUp('shift')
# jetzt muss man nur noch den Ablauf wiederholen
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#jetzt habe ich nochmal das gleiche gecopyed
keyDown('k')
keyDown("w") #pressing down key 'a'
sleep(1)
keyDown('capslock')
sleep(134) #how ever long you want
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

pyautogui.moveTo(x=825,y=808)
pyautogui.click() #legt das e cobblestone in die enderchest

pyautogui.moveTo(x=750,y=808)
pyautogui.click()   #legt jedes restliche cobblestone in die enderchest



keyDown('e')
keyUp('e')
keyUp('shift')

# jetzt muss man nur noch den Ablauf wiederholen
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#jetzt habe ich nochmal das gleiche gecopyed
keyDown('k')
keyDown("w") #pressing down key 'a'
sleep(1)
keyDown('capslock')
sleep(133) #how ever long you want
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



pyautogui.moveTo(x=825,y=808)
pyautogui.click() #legt das e cobblestone in die enderchest

pyautogui.moveTo(x=750,y=808)
pyautogui.click()   #legt jedes restliche cobblestone in die enderchest

keyDown('e')
keyUp('e')
keyUp('shift')
# jetzt muss man nur noch den Ablauf wiederholen
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#jetzt habe ich nochmal das gleiche gecopyed
keyDown('k')
keyDown("w") #pressing down key 'a'
sleep(1)
keyDown('capslock')
sleep(133) #how ever long you want
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

pyautogui.moveTo(x=825,y=808)
pyautogui.click() #legt das e cobblestone in die enderchest

pyautogui.moveTo(x=750,y=808)
pyautogui.click()   #legt jedes restliche cobblestone in die enderchest



keyDown('e')
keyUp('e')
keyUp('shift')

# jetzt muss man nur noch den Ablauf wiederholen
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#jetzt habe ich nochmal das gleiche gecopyed
keyDown('k')
keyDown("w") #pressing down key 'a'
sleep(1)
keyDown('capslock')
sleep(133) #how ever long you want
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

pyautogui.moveTo(x=825,y=808)
pyautogui.click() #legt das e cobblestone in die enderchest


pyautogui.moveTo(x=750,y=808)
pyautogui.click()   #legt jedes restliche cobblestone in die enderchest


keyDown('e')
keyUp('e')
keyUp('shift')
# jetzt muss man nur noch den Ablauf wiederholen
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#
#jetzt habe ich nochmal das gleiche gecopyed
keyDown('k')
keyDown("w") #pressing down key 'a'
sleep(1)
keyDown('capslock')
sleep(133) #how ever long you want
keyUp("w") #stop pressing key 'a' down
keyUp('capslock')
keyUp('k')
keyDown('e')
keyUp('e')
sleep(0.5)
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
#########################################################################################################################
#das könnte falsch sein, ich tue den letzten spot aus der enderchest raus und dann den 2 slot aus dem inventar rein.
#sleep(2)
#pyautogui.moveTo(x=1260,y=450)
#pyautogui.click()
#sleep(2)
#pyautogui.moveTo(x=750,y=809)
#pyautogui.click()
#########################################################################################################################
#Hier ist das fertig

keyDown('e')
keyUp('e')

keyDown('e')
keyUp('e')

#Jetzt kommt die Enderchest zu enchanten cobblestone zsm craften
#Jetzt kommt die Enderchest zu enchanten cobblestone zsm craften
#Jetzt kommt die Enderchest zu enchanten cobblestone zsm craften
#Jetzt kommt die Enderchest zu enchanten cobblestone zsm craften
#Jetzt kommt die Enderchest zu enchanten cobblestone zsm craften
#Jetzt kommt die Enderchest zu enchanten cobblestone zsm craften
#Jetzt kommt die Enderchest zu enchanten cobblestone zsm craften
###############################################################
###############################################################
###############################################################
###############################################################
###############################################################
###############################################################
###############################################################
###############################################################
###############################################################
###############################################################
###############################################################
###############################################################
###############################################################
#Jetzt kommt die Enderchest zu enchanten cobblestone zsm craften
#Jetzt kommt die Enderchest zu enchanten cobblestone zsm craftene

keyUp('shift')  # Man muss shift loslassen um in die enderchest zu kommen
sleep(0.5)
pyautogui.moveTo(x=1500,y=805)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=1188,y=346)
pyautogui.click()                #Geht in die Enderchest
sleep(0.25)
keyDown('shift') # Hier aktiveren wir shift wieder



pyautogui.moveTo(x=690,y=308)
pyautogui.click()
pyautogui.moveTo(x=752,y=307)
pyautogui.click()
pyautogui.moveTo(x=825,y=308)
pyautogui.click()
pyautogui.moveTo(x=900,y=308)
pyautogui.click()
pyautogui.moveTo(x=1040,y=308)
pyautogui.click()

pyautogui.moveTo(x=1115,y=308)
pyautogui.click()
pyautogui.moveTo(x=1185,y=305)
pyautogui.click()
pyautogui.moveTo(x=1255,y=305)
pyautogui.click()
pyautogui.moveTo(x=685,y=377)
pyautogui.click()
pyautogui.moveTo(x=750,y=377)
pyautogui.click()

pyautogui.moveTo(x=828,y=377)
pyautogui.click()
pyautogui.moveTo(x=900,y=377)
pyautogui.click()
pyautogui.moveTo(x=970,y=377)
pyautogui.click()
pyautogui.moveTo(x=1040,y=377)
pyautogui.click()
pyautogui.moveTo(x=1115,y=377)
pyautogui.click()

pyautogui.moveTo(x=1185,y=377)
pyautogui.click()
pyautogui.moveTo(x=1255,y=377)
pyautogui.click()
pyautogui.moveTo(x=685,y=450)
pyautogui.click()
pyautogui.moveTo(x=750,y=450)
pyautogui.click()
pyautogui.moveTo(x=825,y=450)
pyautogui.click()

pyautogui.moveTo(x=903,y=450)
pyautogui.click()
pyautogui.moveTo(x=970,y=450)
pyautogui.click()
pyautogui.moveTo(x=1045,y=450)
pyautogui.click()
pyautogui.moveTo(x=1120,y=450)
pyautogui.click()
pyautogui.moveTo(x=1185,y=450)
pyautogui.click()

keyUp('shift') 


keyDown('e')
keyUp('e')

keyDown('e')
keyUp('e')

pyautogui.moveTo(x=1500,y=804) #geht auf den stern
sleep(0.5)

pyautogui.click()

#Jetzt ist alles aus der enderchest im inventar
#Jetzt ist alles aus der enderchest im inventar
#Jetzt ist alles aus der enderchest im inventar
#Jetzt ist alles aus der enderchest im inventar
#Jetzt ist alles aus der enderchest im inventar
#Jetzt ist alles aus der enderchest im inventar
#Jetzt ist alles aus der enderchest im inventar
sleep(0.5)

pyautogui.moveTo(x=967,y=413) # geht auf den crafting table
pyautogui.click()

sleep(0.5)
pyautogui.moveTo(680,753)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(680,680,0.5)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(1256,750,0.5)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(680,753,0.5)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(680,680,0.5)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(1256,750,0,5)
pyautogui.click()
sleep(0.5)

keyDown('shift')
pyautogui.moveTo(x=760,y=930) 
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
pyautogui.click()


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
pyautogui.click() 

pyautogui.moveTo(x=1260,y=827)
pyautogui.click()
pyautogui.moveTo(x=685,y=757)
pyautogui.click()
pyautogui.moveTo(x=755,y=760)
pyautogui.click()
pyautogui.moveTo(x=835,y=760)
pyautogui.click()
pyautogui.moveTo(x=900,y=760)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=1038,y=342)
pyautogui.click() 

pyautogui.moveTo(x=970,y=760)
pyautogui.click()
pyautogui.moveTo(x=1045,y=760)
pyautogui.click()
pyautogui.moveTo(x=1115,y=760)
pyautogui.click()
pyautogui.moveTo(x=1185,y=760)
pyautogui.click()
pyautogui.moveTo(x=1255,y=760)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=1038,y=342)
pyautogui.click()

sleep(1)
keyDown('e')
keyUp('e')

sleep(1)
keyDown('e')
keyUp('e')

keyUp('shift')  # Man muss shift loslassen um in die enderchest zu kommen
sleep(0.5)
pyautogui.moveTo(x=1500,y=805)
pyautogui.click()
sleep(0.5)
pyautogui.moveTo(x=1188,y=346)
pyautogui.click()                #Geht in die Enderchest
sleep(0.25)
keyDown('shift') # Hier aktiveren wir shift wieder

pyautogui.moveTo(x=970,y=303)
pyautogui.click()
sleep(1)
pyautogui.moveTo(x=1255,y=448)
pyautogui.click()
sleep(1)
keyUp('shift')
sleep(1)
keyDown('e')
keyUp('e')


#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#Jetzt ist alles fertig zsm gecraftet 
# man ist jetzt aber noch im crafting table
# und es sind noch cobblestone überig 
#Siehe bild:
# C:\Users\User\Pictures\hotbarFürProgrammieren.PNG
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
#################################################################################################################################################################################
sleep(1)
keyDown('d')
sleep(2)
keyUp('d')
sleep(5) #man geht ins wasser

pyautogui.moveTo(957,750,2)
keyDown('d')
sleep(2)
keyUp('d') #jetzt steht man auf der kiste
sleep(0.25)
pyautogui.click(button='right')  # right-click the mouse
#Hier müssen wir jetzt alles aus dem inventar in die chest legen
sleep(0.5)
keyDown('shift')
pyautogui.moveTo(x=760,y=930) 
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

pyautogui.moveTo(x=1115,y=918)
pyautogui.click() #1
pyautogui.moveTo(x=1188,y=918)
pyautogui.click() #2

keyUp('shift')
keyDown('e')
keyUp('e')



sleep(0.5)
keyDown('s')
sleep(3)
keyUp('s') #jetzt gehen wir nach hinten


sleep(0.5)
keyDown('a')
sleep(4)
keyUp('a')
keyDown('w')
sleep(1)
keyUp('w')
sleep(0.25)
keyDown('d')
sleep(0.5)
keyUp('d')

sleep(0.25)
keyDown('w')
sleep(1)
keyUp('w')

pyautogui.moveTo(967,30,2)
