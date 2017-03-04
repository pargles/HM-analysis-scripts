#!/bin/sh
#path=../../../../../../home/pargles/Documents/codificador/HM-12.0t4
path=../../../../../../home/pargles/Documents/codificador/HM-12.0
out=Output-online-trees-hm12-with10TimesPenalty-qp37.txt

#BQSquare_416x24
#BasketballPass_416x240
#BasketballDrill_832x480
#ChinaSpeed_1024x768
#SlideEditing_1280x720
#BQTerrace_1920x1080
#Cactus_1920x1080
#Kimono1_1920x1080
#PeopleOnStreet_2560x1600
#SteamLocomotiveTrain_2560x1600

${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/BQSquare.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}

${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/BasketballPass.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}

#${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/BasketballDrill.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}

#${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/ChinaSpeed.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}

#${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/SlideEditing.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}

#${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/BQTerrace.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}

#${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/Cactus.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}

#${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/Kimono.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}

#${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/PeopleOnStreet.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}

#${path}/bin/TAppEncoderStaticd -c ${path}/cfg/per-sequence/SteamLocomotiveTrain_10bit.cfg -c ${path}/cfg/encoder_randomaccess_main_qp37.cfg >> ${out}
