#!/bin/sh

cd git-resource

# update version
sed "s/DOCKER_VERSION/$(cat ../version/number)/g" ci/deployment.yml > ../build/deployment.yml

# package
gradle build
cp build/libs/*.jar ../build

# 
cp ci/Dockerfile ../build
