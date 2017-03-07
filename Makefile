
clean:
	find . -name "*.class" -type f -delete

submodule:
	git submodule update --recursive --remote
