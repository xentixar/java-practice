%:
	mkdir -p build
	javac $@.java -d build && cd build && java $@ && cd ..
