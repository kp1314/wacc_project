# Sample Makefile for the WACC Compiler lab: edit this to build your own comiler
# Locations

ANTLR_DIR	:= antlr
SOURCE_DIR	:= src
OUTPUT_DIR	:= bin 
CLASSPATH := lib/antlr-4.4-complete.jar:/usr/share/java/junit4-4.11.jar

# Tools

ANTLR	:= antlrBuild
FIND	:= find
RM	:= rm -rf
MKDIR	:= mkdir -p
JAVA	:= java
JAVAC	:= javac

# Sources

SMACC_SOURCES := $(shell $(FIND) $(SOURCE_DIR)/smacc -name "*.java" -not -path \
    $(SOURCE_DIR)/smacc/test/*)
ANTLR_SOURCE := $(ANTLR_DIR)/WACCLexer.g4 $(ANTLR_DIR)/WACCParser.g4

JFLAGS	:= -sourcepath $(SOURCE_DIR) -d $(OUTPUT_DIR) -cp $(CLASSPATH)


all: antlr smacc 


# Generate java sources from antlr then compile

antlr: $(ANTLR_SOURCE)
	cd $(ANTLR_DIR) && ./$(ANTLR) 
	$(MKDIR) $(OUTPUT_DIR)
	@echo "Compiling antlr Java sources..."
	@$(JAVAC) $(JFLAGS) $$($(FIND) $(SOURCE_DIR)/antlr -name '*.java')
	@echo "Done"

# Compile all smacc sources

smacc: $(SMACC_SOURCES)
	$(MKDIR) $(OUTPUT_DIR)
	@echo "Compiling smacc Java sources..."
	@$(JAVAC) $(JFLAGS) $(SMACC_SOURCES)
	@echo "Done"


clean:
	$(FIND) $(OUTPUT_DIR) -name "*.class" > $@
	$(RM) $$(cat $@)
	$(RM) $@

.PHONY: all smacc clean antlr
