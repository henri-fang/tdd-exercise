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

Gossiping bus drivers lose one minute to tell each other the gossip. If they have nothing new to say, they don't wait
that minute.

## 8. 骰子游戏

在骰子游戏，每位玩家投掷 5 次 6 面骰子，玩家投掷的结果如果符合某几个得分规则，则取最高分值的规则并加上基础分。举个例子，
假如玩家投掷的是 5、6、5、5、2，在以下规则中会得到 15 分（三个相同的 5）。15 分加上数基础分（5+6+5+5+2）23 分总分为 38 分。 
请按照给定的投掷结果和给定的得分规则计算总分，并不需要完成随时投掷骰子的功能。程序应该帮助玩家选择最高的得分算法。

| 规则         | 概述                                   | 举例                               |
| :----------- | :------------------------------------- | :--------------------------------- |
| 基础分       | 所有骰子分的总和                       | 1，1，3，3，6 总分 14（1+1+3+3+6） |
| 全都相同     | 如果所有值都相同，则玩家可以获得 50 分 | 1，1，1，1，1 总分 50              |
|              |                                        | 1，1，1，2，1 总分 0               |
| 两个相同     | 最大的一两个相同的总和                 | 1，1，6，2，6 总分 12（6+6）       |
|              |                                        | 3，3，3，4，1 总分 6（3+3）        |
| 两个两个相同 | 两对的总和                             | 1，1，2，3，3 总分 8（1+1+3+3）    |
|              |                                        | 1，1，2，3，4 总分 0               |
|              |                                        | 1，1，2，2，2 总分 6（1+1+2+2）    |
| 三个相同     | 三个相同数字的总和                     | 3，3，3，4，5 总和 9（3+3+3）      |
|              |                                        | 3，3，4，5，6 总和 0               |
|              |                                        | 3，3，3，3，1 总和 9（3+3+3）      |
| 四个相同     | 四个相同数字的总和                     | 2，2，2，2，5 总和 8               |
|              |                                        | 2，2，2，5，5 总和 0               |
|              |                                        | 2，2，2，2，2 总额 8               |

## 9. 登录验证

As a registered user 
I want to login 
so that I can go shopping online

### Tasking
Given 用户名和密码正确, When 登录, Then 登录成功 <br>
Given 用户不存在, When 登录, Then 登录失败 <br>
Given 用户密码错误, When登录, Then 失败失败 <br>

## 10. 出租车计费系统

老板想要一个出租车计费系统，它的计算规则是这样的：

1. 不超过8公里时每公里收费0.8元；
2. 超过8公里则每公里加收50%长途费；
3. 停车等待时每分钟加收0.25元；

### Tasking 

Given 乘客刚上车还没开车(0公里)，未发生等待，When 计费，Then 收费0元 <br>
Given 乘客上车后还没开车，等待10分钟，When 计费，Then 收费2.5元 <br>
Given 出租车恰好行驶了8公里，未发生等待，When 计费，Then 收费6.4元 <br>
Given 出租车恰好行驶了8公里，等待10分钟，When 计费，Then 收费8.9元 <br>
Given 出租车行驶了5公里(8公里以内)，未发生等待，When 计费，Then 收费4元 <br>
Given 出租车行驶了5公里，等待10分钟，When 计费，Then 收费6.5元 <br>
Given 出租车行驶了10公里(超过8公里)，未发生等待，When 计费，Then 收费12元 <br>
Given 出租车行驶了10公里，等待10分钟，When 计费，Then 收费14.5元 <br>
