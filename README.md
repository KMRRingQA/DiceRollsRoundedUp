# DiceRoll Monte Carlo vs Analytic

## Description

A little program to back up my analytical solution to a situation where any even-sided dice (traditionally d6,d8,d10,d12 for the boardgame Dungeons & Dragons) may be rounded up to the higher average (4 for 6-sided, 5 for 8-sided etc.) when rolling below it. This approach only works for dice with sides n greater or equal than 4.
So, for a d6:

1    ->  4,
2    ->  4,
3    ->  4,
4    ->  4,
5    ->  5,
6    ->  6
average roll  =  (4 + 4 + 4 + 4 + 5 + 6)/6 = 27/6 = 4.5

![Analytical Proof](https://i.imgur.com/SqBLzLY.png)
![Analytical Proof2](https://i.imgur.com/OObs6iM.png)
![Monte Carlo Proof](https://i.imgur.com/CiNdlMs.png)
![Proof by Induction1](https://i.imgur.com/jcFD3xo.png)
![Proof by induction2](https://i.imgur.com/KvjKwZ4.png)
