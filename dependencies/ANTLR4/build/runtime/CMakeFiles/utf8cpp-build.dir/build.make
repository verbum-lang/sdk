# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.16

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/user/projects/sdk/dependencies/ANTLR4

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/user/projects/sdk/dependencies/ANTLR4/build

# Utility rule file for utf8cpp-build.

# Include the progress variables for this target.
include runtime/CMakeFiles/utf8cpp-build.dir/progress.make

runtime/CMakeFiles/utf8cpp-build: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-build


runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-build: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-configure
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/user/projects/sdk/dependencies/ANTLR4/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Performing build step for 'utf8cpp'"
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-build && $(MAKE)
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-build && /usr/bin/cmake -E touch /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-build

runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-configure: runtime/utf8cpp-prefix/tmp/utf8cpp-cfgcmd.txt
runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-configure: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-skip-update
runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-configure: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-patch
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/user/projects/sdk/dependencies/ANTLR4/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Performing configure step for 'utf8cpp'"
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-build && /usr/bin/cmake -DCMAKE_INSTALL_PREFIX=/home/user/projects/sdk/dependencies/ANTLR4/build/runtime/thirdparty/utfcpp/install -DUTF8_TESTS=off -DUTF8_SAMPLES=off "-GUnix Makefiles" /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/thirdparty/utfcpp
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-build && /usr/bin/cmake -E touch /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-configure

runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-skip-update: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-download
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/user/projects/sdk/dependencies/ANTLR4/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Skipping update step for 'utf8cpp'"
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/thirdparty/utfcpp && /usr/bin/cmake -E echo_append

runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-patch: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-download
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/user/projects/sdk/dependencies/ANTLR4/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_4) "No patch step for 'utf8cpp'"
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E echo_append
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E touch /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-patch

runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-download: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-gitinfo.txt
runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-download: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-mkdir
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/user/projects/sdk/dependencies/ANTLR4/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_5) "Performing download step (git clone) for 'utf8cpp'"
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/thirdparty && /usr/bin/cmake -P /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/tmp/utf8cpp-gitclone.cmake
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/thirdparty && /usr/bin/cmake -E touch /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-download

runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-mkdir:
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/home/user/projects/sdk/dependencies/ANTLR4/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_6) "Creating directories for 'utf8cpp'"
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E make_directory /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/thirdparty/utfcpp
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E make_directory /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-build
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E make_directory /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E make_directory /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/tmp
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E make_directory /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-stamp
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E make_directory /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E make_directory /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-stamp
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && /usr/bin/cmake -E touch /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-mkdir

utf8cpp-build: runtime/CMakeFiles/utf8cpp-build
utf8cpp-build: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-build
utf8cpp-build: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-configure
utf8cpp-build: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-skip-update
utf8cpp-build: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-patch
utf8cpp-build: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-download
utf8cpp-build: runtime/utf8cpp-prefix/src/utf8cpp-stamp/utf8cpp-mkdir
utf8cpp-build: runtime/CMakeFiles/utf8cpp-build.dir/build.make

.PHONY : utf8cpp-build

# Rule to build all files generated by this target.
runtime/CMakeFiles/utf8cpp-build.dir/build: utf8cpp-build

.PHONY : runtime/CMakeFiles/utf8cpp-build.dir/build

runtime/CMakeFiles/utf8cpp-build.dir/clean:
	cd /home/user/projects/sdk/dependencies/ANTLR4/build/runtime && $(CMAKE_COMMAND) -P CMakeFiles/utf8cpp-build.dir/cmake_clean.cmake
.PHONY : runtime/CMakeFiles/utf8cpp-build.dir/clean

runtime/CMakeFiles/utf8cpp-build.dir/depend:
	cd /home/user/projects/sdk/dependencies/ANTLR4/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/user/projects/sdk/dependencies/ANTLR4 /home/user/projects/sdk/dependencies/ANTLR4/runtime /home/user/projects/sdk/dependencies/ANTLR4/build /home/user/projects/sdk/dependencies/ANTLR4/build/runtime /home/user/projects/sdk/dependencies/ANTLR4/build/runtime/CMakeFiles/utf8cpp-build.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : runtime/CMakeFiles/utf8cpp-build.dir/depend

