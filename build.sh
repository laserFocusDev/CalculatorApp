#!/bin/bash
set -e

mkdir -p bin
javac -d bin $(find src -name "*.java") $(find tests -name "*.java")

echo "✅ Build successful!"
