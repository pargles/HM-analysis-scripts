#!/bin/sh
path=../../../../../../home/pargles/Documents/codificador_original/HM-12.0

echo ${path}running C45 example

${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/BasketballPass.cfg -c ${path}/cfg/encoder_randomaccess_main.cfg

