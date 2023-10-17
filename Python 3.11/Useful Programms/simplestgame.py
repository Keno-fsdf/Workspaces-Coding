import pygame
from pygame.locals import *
import pyautogui
import time



pygame.init()



class window:   
    
    def window_setting():
        size_of_the_window = width, height = (800, 800)
        road_w = int(width/1.6)
        screen = pygame.display.set_mode((size_of_the_window))
        screen.fill((0,0,0))
        
        pygame.draw.rect(screen, (50,50,50), (width/5,0  ,road_w/1.5, height))
        pygame.display.update() 
        pygame.display.set_caption("Car Game")


       
    



    def closing_the_window():
        Running_Game = True
        while Running_Game ==True:
         for event in pygame.event.get():
             if event.type == pygame.QUIT:
              Running_Game = False

    

    window_setting()
    closing_the_window()







    
window()




time.sleep(0)
pygame.quit()