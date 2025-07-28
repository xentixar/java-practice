DRIVERS := $(wildcard drivers/*.jar)
JARPATH := $(subst $(space),:,$(DRIVERS))
space := $(null) $(null)

%:
	mkdir -p build
	javac -d build -cp "$(JARPATH)" $@.java
	cd build && java -cp ".:../$(JARPATH)" $@
