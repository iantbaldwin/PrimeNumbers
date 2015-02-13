Prime Counter
=============

About Prime Counter
-------------------
Prime Counter is a tool written in Java to find and count prime numbers
under a certain value. It's purpose when I began writting the code was to 
serve as a single-core benchmarking utility so I could see which of my 
computers was faster, at least at finding prime numbers on a single core.
I drew inspiration from [this]("http://hackaday.com/2015/02/05/benchmarking-the-raspberry-pi-2/" "Benchmarking the Raspberry Pi 2") article on Hackaday.
I also thought that it would be fun just from my general interest in math. 

Future Plans
------------
I really enjoyed the process of creating my 'own' algorithm to determine if
a number is prime; I saw 'own' because, while I thought it out on my own, I 
highly doubt that I am the first person to determine primes in such a way. As
my work on this project continues, I will add my first two algorithms and continue
to develope even more efficent ones. When that time comes, I will these as 
different methods in the PrimesList class. 

Usage
-----
For the time being, this remains a cli based program. I see no reason to implement a 
GUI for it as I would like for it to be able to be used as on many systems as possible.
Not that a GUI would really inhibit the use of the command line, I just prefer the command
line for stuff like this.
All of the source code is located in the *bin* folder. 
To execute the test use:
	java PrimeCounter