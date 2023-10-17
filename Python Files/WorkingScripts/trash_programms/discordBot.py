# bot.py
import os
import time
import discord
import random



client = discord.Client()


sicssors = 3
paper = 2
stone = 1


loop = 0
        

@client.event
async def on_message(message):
    loop = 0
    if message.author == client.user:
        return
    if 'rps' in message.content.lower():
        await message.channel.send('Lets play :scissors: :roll_of_paper: , stein ')
        await message.channel.send('write your choice but dont send it yet')
        # time.sleep(5)
        await message.channel.send('send your choice in:')
        await message.channel.send(3)
        # time.sleep(3)
        await message.channel.send(2)
        # time.sleep(2)
        await message.channel.send(1)
        # time.sleep(1)
        await message.channel.send('now')
        @client.event
        async def fn_message(message1): #ist glaube ich kompletter bullshit ist aber nen try wert
            loop = 0
            while loop <4:
                
                if 's' in message1.content.lower():
                    number_OF_1Player = 'sicssors'
                    loop = loop + 1
                    print('it worked')
                elif 'p' in message1.content.lower():
                    number_OF_2Player = 'paper'
                    loop = loop + 1
                elif 't' in message1.content.lower():
                    number_OF_3Player = 'stone'
                    loop = loop + 1


        
        
        
             
        


         


   
                

@client.event
async def on_ready():
    print(f'{client.user.name} has connected to Discord!')

@client.event
async def on_member_join(member):
    await member.create_dm()
    await member.dm_channel.send(
        f'Hi {member.name}, welcome to my Discord server!'
    )


    

client.run("NzA4MzM4MTM1NDczNDU1NDY1.XrV5Zw.d2lzUzbKQ2TRBeWecFM45hkEAtY")