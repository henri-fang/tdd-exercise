# tdd-exercise

## 1. Multiples of 3 or 5

[source from](https://projecteuler.net/problem=1)

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.

## 2.Smallest multiple

[source from](https://projecteuler.net/problem=5)

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is the
smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

## 3.Palindrome checker

[source from](https://khalilstemmler.com/articles/test-driven-development/introduction-to-tdd/#Requirements)
A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.

## 4. CalcStats

[source from](https://www.programmingwithwolfgang.com/tdd-kata)
Your task is to process a sequence of integer numbers to determine the following statistics:

minimum value maximum value number of elements in the sequence average value For example: [6, 9, 15, -2, 92, 11]

minimum value = -2 maximum value = 92 number of elements in the sequence = 6 average value = 21.833333

## 5. OddEven

[source from](https://github.com/garora/TDD-Katas/tree/master/src#the-oddeven-kata)

Write a program that prints numbers within specified range lets say 1 to 100. If number is odd print 'Odd' instead of
the number. If number is even print 'Even' instead of number. Else print number [hint - if number is Prime].

- Definition of Even(偶数): Integers which are divisible by 2 are known as even numbers
- Definition of Odd(奇数): Integers which are not divisible by 2 are known as odd numbers
- Definition of Prime(质数): Every prime number is an odd number except number 2.

## 6.Recently used list

[source from](https://www.programmingwithwolfgang.com/tdd-kata/#recently-used-list)

Develop a recently-used-list class to hold strings uniquely in Last-In-First-Out order.

The most recently added item is first, the least recently added item is last.

- Items can be looked up by index, which counts from zero.
- Items in the list are unique, so duplicate insertions are moved rather than added.
- A recently-used-list is initially empty.

## 7. Gossiping Bus Drivers

[source from](https://kata-log.rocks/gossiping-bus-drivers-kata)

Bus drivers like to gossip, everyone knows that. And bus drivers can gossip when they end up at the same stop. So now we
are going to calculate after how many stops all the bus drivers know all the gossips. You will be given a number of bus
routes that the drivers follow. Each driver starts with one gossip. Each route is appointed to 1 driver. When 2 or more
drivers are at the same stop (even if it is the start), they can exchange all the gossips they know. A route looks like
this: 1 2 3 4 and is repeated over the whole day like this 1 2 3 4 1 2 3 4 1 2 3 … If a driver starts and stops at the
same stop then that is also repeated. All drivers take 1 minute to go from one stop to another and the gossip exchange
happens instantly. All drivers drive 8 hours a day so you have a maximum of 480 minutes to get all the gossiping around.

Input Description You will receive all the driver routes. Not all drivers have a route of the same length

Example 1:

```
3 1 2 3
3 2 3 1
4 2 3 4 5
```

Example 2:

```
2 1 2
5 2 8
```

Output Description The number of stops it takes to have all drivers on board with the latest gossips. If there is even
one driver who does not have all the gossips by the end of the day, the answer is never.

Example 1: 5

Example 2: never

### Bonus
Gossiping bus drivers lose one minute to tell each other the gossip. If they have nothing new to say, they don't wait that minute.