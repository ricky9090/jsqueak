# JSqueak -- Java implementation of the Squeak Smalltalk Virtual Machine

This is a fork of **JSqueak**.

JSqueak is a Java implementation of the Squeak Smalltalk virtual machine, originally 
developed by Daniel H. H. Ingalls.

Since the official site of JSqueak: 

http://research.sun.com/projects/JSqueak 

seems to be deprecated, this repository is forked from repository of Victor Rodriguez : https://github.com/victorr/jsqueak

JSqueak was released under the MIT license (see https://news.squeak.org/2008/06/21/jsqueak-smalltalk-interpreter-written-in-java).


## Goals
Currentlly, this repo is for studying propurse. 

I'm trying to add more primitives and implementations to the vm to run a full version of Squeak 2.2

#### Noteable changes / improvements:
* Fix floating-point numbers issue. Now JSqueak can read floating-point numbers from image file correctly. 
  To verfiy this issue, try to move/resize the welcome window.
* Add support for Window resizing (Unfinished, have to "restore display" twice manually after resizing).
* Use a separate thread to notify input event, reduce input lag.

#### TODO
* Add support for 8/16/32-bit color display.
* More primitives implementation.


## Useful Materials
Here are some useful materials for Smalltalk

**Squeak Official WebSite**<br/>
https://squeak.org/

**Pharo Official WebSite**<br/>
https://pharo.org/

**All history version of Squeak to downlaod**<br/>
http://files.squeak.org/

**For Squeak 2.2** and its VM implementation in C source code<br/> 
http://files.squeak.org/2.2/2.2.tar.gz

**Smalltalk-80: The Language and its Implementation** (aka The BlueBook)<br/>
http://stephane.ducasse.free.fr/FreeBooks/BlueBook/Bluebook.pdf

**ST-80**<br/>
A Smalltalk-80 virtual machine by Dr. Hans-Walter Latz. Based on the "Bluebook" specification, implemented in Java 8.<br/>
https://github.com/devhawala/ST80

**SqueakJS**<br/>
An HTML5 runtime engine for Squeak Smalltalk written in pure JavaScript by Vanessa Freudenberg.<br/>
https://github.com/codefrau/SqueakJS


