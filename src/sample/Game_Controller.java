package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.input.MouseEvent;

public class Game_Controller extends Main {
    @FXML
    private AnchorPane Game;
    @FXML
    private RadioButton _1,_2,_3,_4,_5,_6,_7,_8,_9,_10,_11,_12,_13,_14,_15,_16,_17,_18,_19,_20,_21,_22,_23,_24,_25,_26,_27,_28,_29,_30,_31,_32,_33,_34,_35,_36;


    public void onExitButton(MouseEvent event) {
        Platform.exit();
        System.exit(0);
    }

    public void addLine(){
        Line line1=new Line(10, 20,110,20);
        Game.getChildren().addAll(line1);
    }

    public void Line() {
        if (_1.isSelected()) {
            if (_2.isSelected()) {
                System.out.println("1");
            }
            if (_7.isSelected()) {
                System.out.println("2");
            }
            if (_8.isSelected()) {
                System.out.println("3");
            }
        }
        if (_2.isSelected()) {
            if (_3.isSelected()) {
                System.out.println("4");
            }
            if (_9.isSelected()) {
                System.out.println("5");
            }
            if (_8.isSelected()) {
                System.out.println("6");
            }
            if (_7.isSelected()) {
                System.out.println("7");
            }
        }
        if (_3.isSelected()) {
            if (_4.isSelected()) {
                System.out.println("8");
            }
            if (_9.isSelected()) {
                System.out.println("9");
            }
            if (_8.isSelected()) {
                System.out.println("10");
            }
            if (_10.isSelected()) {
                System.out.println("11");
            }
        }
        if (_4.isSelected()) {
            if (_10.isSelected()) {
                System.out.println("12");
            }
            if (_9.isSelected()) {
                System.out.println("13");
            }
            if (_5.isSelected()) {
                System.out.println("14");
            }
            if (_11.isSelected()) {
                System.out.println("15");
            }
        }
        if (_5.isSelected()) {
            if (_6.isSelected()) {
                System.out.println("16");
            }
            if (_11.isSelected()) {
                System.out.println("17");
            }
            if (_10.isSelected()) {
                System.out.println("18");
            }
            if (_12.isSelected()) {
                System.out.println("19");
            }
        }
        if (_6.isSelected()) {
            if (_11.isSelected()) {
                System.out.println("20");
            }
            if (_12.isSelected()) {
                System.out.println("21");
            }
        }
        if (_7.isSelected()) {
            if (_13.isSelected()) {
                System.out.println("22");
            }
            if (_14.isSelected()) {
                System.out.println("23");
            }
            if (_8.isSelected()) {
                System.out.println("24");
            }
        }
        if (_8.isSelected()) {
            if (_13.isSelected()) {
                System.out.println("25");
            }
            if (_9.isSelected()) {
                System.out.println("26");
            }
            if (_14.isSelected()) {
                System.out.println("27");
            }
            if (_15.isSelected()) {
                System.out.println("28");
            }
        }
        if (_9.isSelected()) {
            if (_14.isSelected()) {
                System.out.println("29");
            }
            if (_15.isSelected()) {
                System.out.println("30");
            }
            if (_16.isSelected()) {
                System.out.println("31");
            }
            if (_10.isSelected()) {
                System.out.println("32");
            }

        }
        if (_10.isSelected()) {
            if (_15.isSelected()) {
                System.out.println("33");
            }
            if (_16.isSelected()) {
                System.out.println("34");
            }
            if (_17.isSelected()) {
                System.out.println("35");
            }
            if (_11.isSelected()) {
                System.out.println("36");
            }
        }
        if (_11.isSelected()) {
            if (_16.isSelected()) {
                System.out.println("37");
            }
            if (_17.isSelected()) {
                System.out.println("38");
            }
            if (_18.isSelected()) {
                System.out.println("39");
            }
            if (_12.isSelected()) {
                System.out.println("40");
            }
        }
        if(_12.isSelected()) {
            if (_18.isSelected()) {
                System.out.println("41");
            }
            if (_17.isSelected()) {
                System.out.println("42");
            }
        }
        if(_13.isSelected()) {
            if (_14.isSelected()) {
                System.out.println("43");
            }
            if (_19.isSelected()) {
                System.out.println("44");
            }
            if (_20.isSelected()) {
                System.out.println("45");
            }
        }
        if(_14.isSelected()) {
            if (_19.isSelected()) {
                System.out.println("46");
            }
            if (_20.isSelected()) {
                System.out.println("47");
            }
            if (_21.isSelected()) {
                System.out.println("48");
            }
            if (_15.isSelected()) {
                System.out.println("49");
            }
        }
        if(_15.isSelected()) {
            if (_16.isSelected()) {
                System.out.println("50");
            }
            if (_21.isSelected()) {
                System.out.println("51");
            }
            if (_22.isSelected()) {
                System.out.println("52");
            }
            if (_20.isSelected()) {
                System.out.println("53");
            }
        }
        if(_16.isSelected()) {
            if (_17.isSelected()) {
                System.out.println("54");
            }
            if (_21.isSelected()) {
                System.out.println("55");
            }
            if (_22.isSelected()) {
                System.out.println("56");
            }
            if (_23.isSelected()) {
                System.out.println("57");
            }
        }
        if(_17.isSelected()) {
            if (_18.isSelected()) {
                System.out.println("58");
            }
            if (_23.isSelected()) {
                System.out.println("59");
            }
            if (_22.isSelected()) {
                System.out.println("60");
            }
            if (_24.isSelected()) {
                System.out.println("61");
            }
        }
        if(_18.isSelected()) {
            if (_23.isSelected()) {
                System.out.println("62");
            }
            if (_24.isSelected()) {
                System.out.println("63");
            }
        }
        if(_19.isSelected()) {
            if (_25.isSelected()) {
                System.out.println("64");
            }
            if (_20.isSelected()) {
                System.out.println("65");
            }
            if (_26.isSelected()) {
                System.out.println("66");
            }
        }
        if(_20.isSelected()) {
            if (_26.isSelected()) {
                System.out.println("67");
            }
            if (_25.isSelected()) {
                System.out.println("68");
            }
            if (_27.isSelected()) {
                System.out.println("69");
            }
            if (_21.isSelected()) {
                System.out.println("70");
            }
        }
        if(_21.isSelected()) {
            if (_26.isSelected()) {
                System.out.println("71");
            }
            if (_27.isSelected()) {
                System.out.println("72");
            }
            if (_22.isSelected()) {
                System.out.println("73");
            }
            if (_28.isSelected()) {
                System.out.println("74");
            }
        }
        if(_22.isSelected()) {
            if (_27.isSelected()) {
                System.out.println("75");
            }
            if (_28.isSelected()) {
                System.out.println("76");
            }
            if (_23.isSelected()) {
                System.out.println("77");
            }
            if (_29.isSelected()) {
                System.out.println("78");
            }
        }
        if(_23.isSelected()) {
            if (_28.isSelected()) {
                System.out.println("79");
            }
            if (_29.isSelected()) {
                System.out.println("80");
            }
            if (_24.isSelected()) {
                System.out.println("81");
            }
            if (_30.isSelected()) {
                System.out.println("82");
            }
        }
        if(_24.isSelected()) {
            if (_29.isSelected()) {
                System.out.println("83");
            }
            if (_30.isSelected()) {
                System.out.println("84");
            }
        }
        if(_25.isSelected()) {
            if (_31.isSelected()) {
                System.out.println("85");
            }
            if (_32.isSelected()) {
                System.out.println("86");
            }
            if (_26.isSelected()) {
                System.out.println("87");
            }
        }
        if(_26.isSelected()) {
            if (_31.isSelected()) {
                System.out.println("88");
            }
            if (_32.isSelected()) {
                System.out.println("89");
            }
            if (_33.isSelected()) {
                System.out.println("90");
            }
            if (_27.isSelected()) {
                System.out.println("91");
            }
        }
        if(_27.isSelected()) {
            if (_32.isSelected()) {
                System.out.println("92");
            }
            if (_33.isSelected()) {
                System.out.println("93");
            }
            if (_28.isSelected()) {
                System.out.println("94");
            }
            if (_34.isSelected()) {
                System.out.println("95");
            }
        }
        if(_28.isSelected()) {
            if (_33.isSelected()) {
                System.out.println("96");
            }
            if (_34.isSelected()) {
                System.out.println("97");
            }
            if (_35.isSelected()) {
                System.out.println("98");
            }
            if (_29.isSelected()) {
                System.out.println("99");
            }
        }
        if(_29.isSelected()) {
            if (_34.isSelected()) {
                System.out.println("101");
            }
            if (_35.isSelected()) {
                System.out.println("102");
            }
            if (_30.isSelected()) {
                System.out.println("103");
            }
            if (_36.isSelected()) {
                System.out.println("104");
            }
        }
        if(_30.isSelected()) {
            if (_35.isSelected()) {
                System.out.println("105");
            }
            if (_34.isSelected()) {
                System.out.println("106");
            }
        }
        if(_31.isSelected()) {
            if (_32.isSelected()) {
                System.out.println("107");
            }
        }
        if(_32.isSelected()) {
            if (_33.isSelected()) {
                System.out.println("108");
            }
        }
        if(_33.isSelected()) {
            if (_34.isSelected()) {
                System.out.println("109");
            }
        }
        if(_34.isSelected()) {
            if (_35.isSelected()) {
                System.out.println("110");
            }
        }
        if(_35.isSelected()) {
            if (_36.isSelected()) {
                System.out.println("111");
            }
        }

    }
}
