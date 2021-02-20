# JSqueak -- Java implementation of the Squeak Smalltalk Virtual Machine

This is a fork of **JSqueak**.

JSqueak is a Java implementation of the Squeak Smalltalk virtual machine, originally 
developed by Daniel H. H. Ingalls.

Since the official site of JSqueak:<br/>
http://research.sun.com/projects/JSqueak 

seems to be deprecated, this repository is forked from repository of Victor Rodriguez:<br/>
https://github.com/victorr/jsqueak


Now JSqueak can load and run a full version of Squeak 2.2 image, but will crash easily.

![Screenshot](jsqueak-demo.png)


## Goals
Currentlly, this repo is for studying purposes.

I'm trying to add more primitive implementations to the vm to run a full version of Squeak 2.2

### Notable changes / improvements:
* Fix floating-point number issue. Now JSqueak can read floating-point numbers from image file correctly. 
  To verfiy this issue, try to move/resize the "Welcome to Mini Squeak 2.2" window (in mini.image).
* Reduce input lag by using a separate thread to notify input event.
* Beta support for Window resizing (Have to do "restore display" twice manually after resizing).
* Beta support for 8-bit color display (Also have to "restore display" manually).

### TODO
* Add support for 16/32-bit color display
* More primitive implementations
* Performance optimization
* **and more ...**

## Useful Materials & References
Here are some useful materials for studying Smalltalk

**Squeak Official WebSite**<br/>
https://squeak.org/

**Pharo Official WebSite**<br/>
https://pharo.org/

**All history version of Squeak to downlaod**<br/>
http://files.squeak.org/

**For Squeak 2.2** and its VM implementation in C source code<br/> 
http://files.squeak.org/2.2/2.2.tar.gz

**Back to the Future The Story of Squeak, A Practical Smalltalk Written in Itself**<br/>
The original paper of Squeak Smalltalk.<br/>
http://files.squeak.org/docs/OOPSLA.Squeak.html

**Smalltalk-80: The Language and its Implementation** (aka The BlueBook)<br/>
http://stephane.ducasse.free.fr/FreeBooks/BlueBook/Bluebook.pdf

**codefrau/SqueakJS**<br/>
An HTML5 runtime engine for Squeak Smalltalk written in pure JavaScript by Vanessa Freudenberg.<br/>
https://github.com/codefrau/SqueakJS

**devhawala/ST80**<br/>
A Smalltalk-80 virtual machine by Dr. Hans-Walter Latz. Based on the "Bluebook" specification, implemented in Java 8.<br/>
https://github.com/devhawala/ST80

**dbanay/Smalltalk**<br/>
A C++ implementation of the Smalltalk-80 system by Dan Banay<br/>
https://github.com/dbanay/Smalltalk

## License
JSqueak was released under the MIT license (see https://news.squeak.org/2008/06/21/jsqueak-smalltalk-interpreter-written-in-java).


