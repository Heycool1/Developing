import random
choice = input('Do you want a roll a dice ? (y/n) : ').lower()
if choice == 'y' :
    num1 = random.randint(1,6)
    num2 = random.randint(1,6)
    print (num1 , num2)
elif choice == 'n' :
    print("Ok You dont")
elif choice == "ys":
    print("13!")
else :
    print("Wrong Letter")