#!/usr/bin/env python3

import platform

a = "hello"
x = 55
#y = int(input('Enter a value: '))
searchThis = open(r"C:\Users\Juju\Google Drive\Programming\Python\Testing\searchthis.txt", 'r')
writeThis = open(r"C:\Users\Juju\Google Drive\Programming\Python\Testing\writethis.txt", 'w')
def main():
    message()


def message():
    print('Hi, nice version {}'.format(platform.python_version()))
    print('extreme lines')
    print('Hello,World. %d' % x)  # Python 2
    print('goodbye, world {}'.format(x))  # Python 3
    print(f'a whole new world. {x}')  # Python 3.6 +


def okIf():
    if x < y:
        print('{} is greater than {} Python 3 in this evaluation of the if statement '.format(x, y))
        print('%d is greater than %d Python 2 in this evaluation of the if statement ' % (x, y))
    else:
        print('No go m8!!')

# if __name__ == '__main__': main()

def fileopen():

    for line in searchThis:
        print('heapsgood')


    fileopen()


