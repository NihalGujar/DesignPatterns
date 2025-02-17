# Singleton Design Pattern

## Objective:
- User should not be able to create instance (object) of a class multiple times.

## Definition:
    The Singleton pattern ensures a class has only one instance, and provides a global point of access to it.

## Issues:
### 1. Accessing of more than one thread
- Sol: Use synchronise keyword
- But using this degrades the efficiency and is relevant for the very first time.

