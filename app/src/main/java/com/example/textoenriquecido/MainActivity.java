package com.example.textoenriquecido;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtv_rich_text;

    private String text = "<ul>\n" +
            "<li>\n" +
            "<b>Blonsky</b> johnnystorm electro quasar blob husk araña x-force eternals gamora madrox whirlwind vanisher dazzler agentx osborn x-statix satana chameleon hulkling.\n" +
            "</li>\n" +
            "<li>\n" +
            "<em>Arnim</em> clea wolfsbane blob steverogers hawkeye romanoff changeling, barnes thunderbolts vision harrier empath clea colossus magneto darkhawk drax hobgoblin x-51.\n" +
            "</li>\n" +
            "<li>\n" +
            "Barton batroc hyperion blackknight caretaker morph mactaggert spider-woman fisk onslaught spider-ham atlas demogoblin corsair callisto felicia spyke pandemic bug lilith!\n" +
            "</li>\n" +
            "<li>\n" +
            "Redskull stick illuminati, masque titania feral kaine hellcat magik cardiac urich felicia manwolf microchip constrictor quentinquire daken sentry shadowcat hyperion.\n" +
            "</li>\n" +
            "<li>\n" +
            "<u>Giantman romanoff x-factor earthquake madthinker felicia quasar caliban sin zemo tonystark nighthawk phalanx bug prowler nuke barton loki brood natasha.</u>\n" +
            "</li>\n" +
            "</ul>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtv_rich_text = findViewById(R.id.txtv_rich_text);
        txtv_rich_text.setText(Html.fromHtml(text));
    }
}
