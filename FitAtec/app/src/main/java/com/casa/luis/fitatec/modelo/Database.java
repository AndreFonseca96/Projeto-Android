

package com.casa.luis.fitatec.modelo;

import com.casa.luis.fitatec.R;
import com.casa.luis.fitatec.modelo.Exercicio;
import com.casa.luis.fitatec.modelo.PlanoPessoal;



import java.util.ArrayList;

/**
 * Created by atecdroid on 7/26/16.
 */

public class Database {

    public static ArrayList<PlanoPessoal> loadPlanos() {
        ArrayList<PlanoPessoal> pp = new ArrayList<>();

//**************** Abs ******************

        PlanoPessoal ppabs = new PlanoPessoal();

        // nome, peso,repeticoes,serie,imagem

        //Crunch
        Exercicio excrunch = new Exercicio("Crunch",0,12,4,R.drawable.crunch);

        //Leg Rise
        Exercicio exlegrise = new Exercicio("Leg Raise",0,10,2,R.drawable.leg_raise);

        //Side Bend
        Exercicio exsidebend = new Exercicio("Side Bend",0,12,3,R.drawable.side_bend);

        //Trunk Rotation
        Exercicio extrunkrotation = new Exercicio("Trunk Rotation",0,10,2,R.drawable.trunk_rotation);

        //Name of Plan
        ppabs.setNome("Plano de Abdominais");

        //ADD Ex
        ppabs.getAl().add(excrunch);
        ppabs.getAl().add(exlegrise);
        ppabs.getAl().add(exsidebend);
        ppabs.getAl().add(extrunkrotation);

        //Add Plan
        pp.add(ppabs);

//******************** Back *******************

        PlanoPessoal ppback = new PlanoPessoal();

        //Hyperextention
        Exercicio exhyper = new Exercicio("Hiperextensões",0,12,4,R.drawable.hyperextension);

        //Wide-Grip Pull-Up
        Exercicio widegrip= new Exercicio("Wide-Grip Pull-Up",0,10,2,R.drawable.wide_grip_pull_up);

        //BarbellDeadlift
        Exercicio barbbelldead= new Exercicio("Barbell Deadlift",30,12,1,R.drawable.barbell_deadlift);

        //Bent-Over BarbellDeadlift
        Exercicio bentover= new Exercicio("Bent-Over Barbell Deadlift",20,12,2,R.drawable.bent_over_barbell_deadlift);

        //Name of Plan
        ppback.setNome("Plano de Costas");

        //ADD Ex
        ppback.getAl().add(exhyper);
        ppback.getAl().add(widegrip);
        ppback.getAl().add(barbbelldead);
        ppback.getAl().add(bentover);

        //Add Plan
        pp.add(ppback);

//**************************** Chest ****************************

        PlanoPessoal ppchest = new PlanoPessoal();

        //Close-Grip BenchPress
        Exercicio exclose = new Exercicio("Close-Grip Bench Press",40,10,3,R.drawable.close_grip_bench_press);

        //Wide-Grip Bench Press
        Exercicio exwide = new Exercicio("Wide-Grip Bench Press",20,12,4,R.drawable.wide_grip_bench_press);

        //Push Up
        Exercicio expushup = new Exercicio("Push Up",0,12,3,R.drawable.push_up);

        //Chest Fly
        Exercicio exchestfly = new Exercicio("Chest Fly",0,12,2,R.drawable.chest_fly);

        //Name of Plan
        ppchest.setNome("Plano de Peito");

        //ADD Ex
        ppchest.getAl().add(exclose);
        ppchest.getAl().add(exwide);
        ppchest.getAl().add(expushup);
        ppchest.getAl().add(exchestfly);

        //Add Plan
        pp.add(ppchest);

//***************************** Shoulders ***********************

        PlanoPessoal ppshoulders = new PlanoPessoal();

        //Rear Deltoid Raise - Elbows Bent
        Exercicio exraisebent = new Exercicio("Rear Deltoid Raise - Elbows Bent",5,12,2,R.drawable.rear_deltoid_raise_elbows_bent);

        //Rear Deltoid Raise - Lying Sideways
        Exercicio raiselying = new Exercicio("Rear Deltoid Raise - Lying Sideways",5,10,3,R.drawable.rear_deltoid_raise_lying_sideways);

        //Military Press - Standing; Behind Neck
        Exercicio pressneck = new Exercicio("Military Press - Standing; Behind Neck",10,12,3,R.drawable.military_press_standingbehind_neck);

        //Military Press - Standing
        Exercicio pressstand = new Exercicio("Military Press - Standing",10,10,3,R.drawable.military_press_standing);

        //Military Press - Seated
        Exercicio pressseated = new Exercicio("Military Press - Seated",10,12,4,R.drawable.military_press_seated);

        //Upright Row
        Exercicio uprightrow = new Exercicio("Upright Row",20,12,2,R.drawable.upright_row);

        //Lateral Deltoid Raise - Standing
        Exercicio raisestand = new Exercicio("Lateral Deltoid Raise - Standing",5,10,2,R.drawable.lateral_deltoid_raise_standing);

        //Name of Plan
        ppshoulders.setNome("Plano de Ombros");

        //ADD Ex
        ppshoulders.getAl().add(exraisebent);
        ppshoulders.getAl().add(raiselying);
        ppshoulders.getAl().add(pressneck);
        ppshoulders.getAl().add(pressstand);
        ppshoulders.getAl().add(pressseated);
        ppshoulders.getAl().add(uprightrow);
        ppshoulders.getAl().add(raisestand);

        //Add Plan
        pp.add(ppshoulders);

//******************************* Legs ****************************************

        PlanoPessoal pplegs = new PlanoPessoal();

        //Squat
        Exercicio squat = new Exercicio("Squat",50,12,4,R.drawable.squats);

        //Leg press
        Exercicio legpress= new Exercicio("Leg press",100,12,3,R.drawable.leg_press);

        //Front Squat - Heels-Elevated
        Exercicio frontsquat = new Exercicio("Front Squat - Heels-Elevated",50,12,3,R.drawable.front_squat_heels_elevated);

        //Front Lunge
        Exercicio frontlunge = new Exercicio("Front Lunge",0,20,1,R.drawable.front_lunge);

        //Side Lunge
        Exercicio sidelunge = new Exercicio("Side Lunge",0,20,1,R.drawable.side_lunge);

        //Leg Curl
        Exercicio legcurl= new Exercicio("Leg Curl",20,12,2,R.drawable.leg_curl);

        //Leg Extension
        Exercicio legext= new Exercicio("Leg Extension",30,10,4,R.drawable.leg_extension);

        //Name of Plan
        pplegs.setNome("Plano de Pernas");

        //ADD Ex
        pplegs.getAl().add(squat);
        pplegs.getAl().add(legpress);
        pplegs.getAl().add(frontsquat);
        pplegs.getAl().add(frontlunge);
        pplegs.getAl().add(sidelunge);
        pplegs.getAl().add(legcurl);
        pplegs.getAl().add(legext);

        //Add Plan
        pp.add(pplegs);

//******************************** Tricep******************************

        PlanoPessoal pptriceps = new PlanoPessoal();

        //Triceps Extension
        Exercicio tricepext = new Exercicio("Triceps Extension",10,12,2,R.drawable.triceps_extension);

        //Dips
        Exercicio dip = new Exercicio("Dips",0,12,4,R.drawable.dips);

        //V-bar press-down
        Exercicio vbarpress = new Exercicio("V-bar press-down",20,12,2,R.drawable.v_bar_press_down);

        //Biceps Curl One-at-a-Time
        Exercicio curloneatatime = new Exercicio("Biceps Curl One-at-a-Time",5,12,4,R.drawable.biceps_curl_one_at_a_time);

        //Decline skullcrusher
        Exercicio declineskull= new Exercicio("Decline Skullcrusher",20,12,2,R.drawable.decline_skullcrusher);

        //Dumbbell Kickback
        Exercicio dumbbellkick = new Exercicio("Dumbbell Kickback",0,12,3,R.drawable.dumbbell_kickback);

        //Single-Arm Overhead Dumbbell Extension
        Exercicio dumbbellexte= new Exercicio("Single-Arm Overhead Dumbbell Extension",10,12,3,R.drawable.single_arm_overhead_dumbbell_extension);

        //Name of Plan
        pptriceps.setNome("Plano de Tricep");

        //ADD Ex
        pptriceps.getAl().add(tricepext );
        pptriceps.getAl().add(dip );
        pptriceps.getAl().add(vbarpress);
        pptriceps.getAl().add(curloneatatime);
        pptriceps.getAl().add(declineskull);
        pptriceps.getAl().add(dumbbellkick);
        pptriceps.getAl().add(dumbbellexte);

        //Add Plan
        pp.add(pptriceps);

//******************************** Bicep******************************

        PlanoPessoal ppbiceps = new PlanoPessoal();

        //Biceps Curl Standing
        Exercicio bicepcurl= new Exercicio("Biceps Curl Standing",20,10,3,R.drawable.biceps_curl_standing);

        //Biceps CurlAlternated
        Exercicio bicepcurlalt = new Exercicio("Biceps Curl Alternated",10,10,3,R.drawable.biceps_curl_alternated);

        //Biceps Curl One-at-a-Time
        Exercicio bicepcurlsim= new Exercicio("Biceps Curl One-at-a-Time",10,10,2,R.drawable.biceps_curl_one_at_a_time);

        //Biceps Curl Hammer Grip
        Exercicio curlhammer = new Exercicio("Biceps Curl Hammer Grip",10,10,4,R.drawable.biceps_curl_hammer_grip);

        //Biceps Curl Incline
        Exercicio bicepcurlinc= new Exercicio("Biceps Curl Incline",10,12,3,R.drawable.biceps_curl_incline);

        //Name of Plan
        ppbiceps.setNome("Plano de Bicep");

        //ADD Ex
        ppbiceps.getAl().add(bicepcurl);
        ppbiceps.getAl().add(bicepcurlalt);
        ppbiceps.getAl().add(bicepcurlsim);
        ppbiceps.getAl().add(curlhammer);
        ppbiceps.getAl().add(bicepcurlinc);

        //Add Plan
        pp.add(ppbiceps);

//************* FIM ***************

        return pp;

    }


}