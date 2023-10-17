import pygame
from pygame.locals import *
import pyautogui
import time
import math
import pygame

pygame.init()
print ()


class window:


    def window_setting():
        Track = pygame.image.load(r"C:\Users\Keno\Desktop\imgs\track.png")

        Track_Border = pygame.image.load(r"C:\Users\Keno\Desktop\imgs\track-border.png")

        Red_car = pygame.image.load(r"C:\Users\Keno\Desktop\imgs\red-car.png")

        size_of_the_window = (1000, 1000) #setting the size of the window

        screen = pygame.display.set_mode((size_of_the_window))
        screen.fill((255,255,255))      #color of the  window
        pygame.display.set_caption("Car Game")        #Headline of the window



        pygame.display.update() 

        screen.blit(Track, (0,0))
        Red_car = pygame.transform.scale(Red_car,(25, 30))
        x_postion = 50
        y_position= 400
        screen.blit(Red_car, (x_postion,y_position))
        

        pygame.display.update() 


      
        pygame.display.update() 





    def closing_the_window():
        Running_Game = True
        while Running_Game ==True:
         for event in pygame.event.get():
             if event.type == pygame.QUIT:
              Running_Game = False
         key = pygame.key.get_pressed()
         if key[pygame.K_w]:
            x_postion+=600
            screen.blit(Red_car, (x_postion,y_position))
            pygame.display.update() 
         if key[pygame.K_w]:
            print("worked")   
    


  
        
           
           
    

    window_setting()
    closing_the_window()







    
window()




time.sleep(0)
pygame.quit()