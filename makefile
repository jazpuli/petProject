all:
	javac Main.java
	javac backend/*.java
	javac frontend/buttons/*.java
	javac frontend/frames/*.java
	javac frontend/labels/*.java

run: all
	java Main

clean:
	rm Main.class
	rm frontend/buttons/*.class
	rm frontend/frames/*.class
	rm frontend/labels/*.class