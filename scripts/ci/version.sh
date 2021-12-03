#!/bin/bash
set -o errexit
set -o nounset
BRANCH="${GITHUB_REF##refs\/heads\/}"

if [ "$BRANCH" = "master" ]; then
  echo "1.1.${GITHUB_RUN_NUMBER}"
else
  echo "0.1.${GITHUB_RUN_NUMBER}-testing"
fi
