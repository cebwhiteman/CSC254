
#lists in python

bicycles = ['trek', 'cannondale', 'redline', 'specialized']
print(bicycles)

print(bicycles[0])
print(bicycles[0].title())

print(bicycles[-1]) #[-1] returns the last item in a list

message = "My first bicycle was a " + bicycles[0].title() + "."
print(message)

names = ['Jessica', 'Erik', 'Christina', 'Filippo']
print(names)
print(names[0])
print(names[1])
print(names[2])
print(names[3])

message = "Hi, " + names[0] + "!"
print(message)
message = "Good morning, " + names[1] + "!"
print(message)
message = "How are you, " + names[2] + "?"
print(message)
message = "What time is it, " + names[3] + "?"
print(message)

motorcycles = ['honda', 'yamaha', 'suzuki']
print(motorcycles)
motorcycles[0] = 'ducati'
print(motorcycles)

motorcycles = ['honda', 'yamaha', 'suzuki']
print(motorcycles)
motorcycles.append('ducati') #append means to add a new item to the end of a list
print(motorcycles)

motorcycles = []
motorcycles.append('honda')
motorcycles.append('yamaha')
motorcycles.append('suzuki')
print(motorcycles)
motorcycles.insert(0, 'ducati') #insert adds a new element to the list at the indicated position
print(motorcycles)

del motorcycles[0] #del deletes an element at a certain position in the list
print(motorcycles)

motorcycles = ['honda', 'yamaha', 'suzuki']
print(motorcycles)
popped_motorcycle = motorcycles.pop() #pop is a way to delete something you might want to use after being deleted
print(motorcycles)
print(popped_motorcycle)

L=[1,2,3]
A=L.pop(1)
print(L)
print(A)

animals1 = ['woof', 'meow', 'squeak', 'moo']
animals2 = animals1.pop(3)
print(animals1)
print(animals2)

guests = ['Isaac Newton', 'Marie Curie', 'Gerard Genette', 'Leonardo da Vinci']
print(guests)
first_guest = guests.pop(0)
message = "Welcome, " + first_guest + "!"
print(message)
second_guest = guests.pop(0)
message = "How are you this evening, " + second_guest + "?"
print(message)
third_guest = guests.pop(0)
message = "Would you like something to drink, " + third_guest + "?"
print(message)
fourth_guest = guests.pop(0)
message = "May I take your coat, " + fourth_guest + "?"
print(message)

guests = ['Isaac Newton', 'Marie Curie', 'Gerard Genette', 'Leonardo da Vinci']
print(len(guests))
del guests[0]
print(guests)
guests.insert(0, 'Niels Bohr')
print(guests)
message = "How are you this evening, " + guests[1] + "?"
print(message)
guests.insert(3, 'Winston Churchill')
print(guests)
guests.append('Charles de Gaulle')
print(guests)

message = "\nThe table is only big enough for two guests"
print(message)
print(guests)
uninvited1 = guests.pop(0)
print(guests)
message = "I'm sorry, " + uninvited1 + "!"
print(message) 
uninvited2 = guests.pop(0)
print(guests)
message = "Please join us next Friday instead, " + uninvited2 + "!"
print(message)
uninvited3 = guests.pop(0)
print(guests)
message = "Can we please reschedule, " + uninvited3 + "?"
print(message)
uninvited4 = guests.pop(0)
print(guests)
message = "Let's find another evening, " + uninvited4 + "."
print(message)
message = "I hope you can still join us tonight, " + guests[0] + "."
print(message)
message = "I am looking forward to seeing you, " + guests[1] + "."
print(message)
del guests[0]
print(guests)
#del guests[1]


