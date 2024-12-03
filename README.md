# file-reversal-operation

## Overview

The **file-reversal-operation** is a Java application that reads an ASCII file, reverses its content, and writes the reversed content to an output file. The project follows a **Test-Driven Development (TDD)** approach, with unit tests designed to mock file operations, avoiding actual file system interactions during testing.

---

## Features

- Reads ASCII content from an input file.
- Reverses the content.
- Writes the reversed content to an output file.
- Designed with TDD principles to ensure correctness and testability.
- Avoids hitting the file system in tests through mocking.

---

## Technology Stack

- **Java**: JDK 18
- **JUnit 5**: Unit testing framework.
- **Mockito**: For mocking file operations.

---

## Project Structure

```plaintext
src/
├── main/
│   └── java/
│       └── FileContentReverser.java   # Core logic to process files
├── test/
│   └── java/
│       └── FileContentReverserTest.java  # Unit tests for FileContentReverser
README.md
pom.xml
