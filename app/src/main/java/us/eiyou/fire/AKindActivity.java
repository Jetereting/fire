package us.eiyou.fire;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class AKindActivity extends AppCompatActivity {

    EditText ed_place,ed_s;
    Button bt_result,b_note;
    TextView tv_result1,tv_result2;
    ListView spinner;
    ImageView iv_note;
    String zong[]={"商场","幼儿园及其它儿童活动场所","寄宿制学校的宿舍","养老院","医院病房和手术室","歌舞娱乐放映游艺场所","商业服务网点","集贸批发市场","省级以上文物保护单位","地下公共建筑","劳动密集型企业","砖木或木结构的古建筑","消防控制室","高层汽车库","地下、半地下汽车库","甲、乙类物品运输车的汽车库、修车库","一类汽车库、修车库、停车场","高层住宅建筑及宿舍、公寓等非住宅类居住建筑的商业服务网点","地下、半地下汽车库","一类汽车库、停车场","甲、乙类生产火灾危险性场所","各工厂的总控制室、分控制室","发电厂(站)和电网经营企业的控制室、设备间","甲、乙类储存物品火灾危险性场所","单、多层公共建筑(除非住宅类居住建筑)","消防设备室、泵房、通风和空气调节机房","油浸变压器室","丙类火灾危险性的配电室等设备间","省级以下文物保护单位","二、三类汽车库、修车库、停车场","高层住宅建筑及宿舍、公寓等非住宅类居住建筑", "单、多层住宅建筑及宿舍、公寓等非住宅类居住建筑的商业服务网点","单、多层木结构住宅建筑及宿舍、公寓等非住宅类居住建筑"," 二、三类汽车库、停车场","非机动车停车库、停车场","丙类生产火灾危险性场所","各种电缆廊道","丙类储存物品火灾危险场所","火柴、香烟、糖、茶叶仓库，粮食、食品仓库","电脑及家用电器仓库","粮食席穴囤","粮食土圆仓","麻、毛、化纤、百货，木材","煤和焦炭等露天、半露天可燃材料堆场","非油浸变压器室","丁类火灾危险性的配电室","四类汽车库、修车库、停车场","单、多层非木结构住宅建筑及宿舍、公寓等非住宅类居住建筑","四类汽车库、停车场","丁、戊类生产火灾危险性场所","丁、戊类木结构厂房","丁、戊类储存物品火灾危险场所","丁、戊类木结构仓库","难燃烧的或非燃烧的建筑装饰材料仓库、露天、半露天堆场","原木仓库、露天、半露天堆场","甲、乙类液体储罐区","可燃、助燃气体储罐区","可燃材料堆场","丙类液体储罐"};
//    String a[]={"幼儿园","儿童","学校","养老院","医院","病房","手术室","歌舞", "娱乐","放映","游艺","集贸","批发","市场","以上","地下公共建筑", "劳动","密集","寄宿制"};
//    String b[]={"砖木","古建筑","控制室","高层汽车库","地下汽车库","运输车","Ⅰ", "高层住宅建筑的商业","高层宿舍的商业","高层公寓的商业", "乙类生产", "甲类生产","工厂","乙类储存","甲类储存"};
//    String c[]={"多层住宅建筑的商业服务网点","消防设备室","泵房","通风","空气调节","丙类火灾","省级以下","Ⅱ","Ⅲ","单层住宅建筑的商业服务网点","宿舍的商业服务网点","公寓的商业服务网点", "露天可燃材料堆场","层木结构","非机动车停车库","非机动车停车场","丙类生产","电缆", "廊道","丙类储存","火柴","香烟","糖","茶叶","粮食","麻", "毛","化纤","百货","木材","煤","焦炭"};
//    String d[]={"非油浸","丁类","Ⅳ类","多层非木","单层非木","丁","戊","难燃烧","非燃烧","原木仓库","露天堆场","非油浸变压器室"};
//    String e[]={"甲类液体储罐","乙类液体储罐","气体"};
//    String f[]={"丙类液体储罐"};
    String a[]={"商场","幼儿园及其它儿童活动场所","寄宿制学校的宿舍","养老院","医院病房和手术室","歌舞娱乐放映游艺场所","商业服务网点","集贸批发市场","省级以上文物保护单位","地下公共建筑","劳动密集型企业"};
    String b[]={"砖木或木结构的古建筑","消防控制室","高层汽车库","地下、半地下汽车库","甲、乙类物品运输车的汽车库、修车库","一类汽车库、修车库、停车场","高层住宅建筑及宿舍、公寓等非住宅类居住建筑的商业服务网点","地下、半地下汽车库","一类汽车库、停车场","甲、乙类生产火灾危险性场所","各工厂的总控制室、分控制室","发电厂(站)和电网经营企业的控制室、设备间","甲、乙类储存物品火灾危险性场所"};
    String c[]={"单、多层公共建筑(除非住宅类居住建筑)","消防设备室、泵房、通风和空气调节机房","油浸变压器室","丙类火灾危险性的配电室等设备间","省级以下文物保护单位","二、三类汽车库、修车库、停车场","高层住宅建筑及宿舍、公寓等非住宅类居住建筑","单、多层住宅建筑及宿舍、公寓等非住宅类居住建筑的商业服务网点","单、多层木结构住宅建筑及宿舍、公寓等非住宅类居住建筑","二、三类汽车库、停车场","非机动车停车库、停车场","丙类生产火灾危险性场所","各种电缆廊道","丙类储存物品火灾危险场所","火柴、香烟、糖、茶叶仓库，粮食、食品仓库","电脑及家用电器仓库","粮食席穴囤","粮食土圆仓","麻、毛、化纤、百货，木材","煤和焦炭等露天、半露天可燃材料堆场"};
    String d[]={"非油浸变压器室","丁类火灾危险性的配电室","四类汽车库、修车库、停车场","单、多层非木结构住宅建筑及宿舍、公寓等非住宅类居住建筑","四类汽车库、停车场","丁、戊类生产火灾危险性场所","丁、戊类木结构厂房","丁、戊类储存物品火灾危险场所","丁、戊类木结构仓库","难燃烧的或非燃烧的建筑装饰材料仓库、露天、半露天堆场","原木仓库、露天、半露天堆场"};
    String e[]={"甲、乙类液体储罐区","可燃、助燃气体储罐区","可燃材料堆场"};
    String f[]={"丙类液体储罐"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kind_a);
        initView();
        ed_place.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (ed_place.getText().toString().length() >= 2) {
                    spinner.setVisibility(View.VISIBLE);
                    spinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(), R.layout.spinner_item, Utils.havedArrayList(zong, ed_place.getText().toString())));
                    spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            ed_place.setText(parent.getItemAtPosition(position).toString());
                            spinner.setVisibility(View.GONE);
                        }

                    });
                } else {
                    spinner.setVisibility(View.GONE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        bt_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ("".equals(ed_place.getText().toString())) {
                    tv_result1.setTextColor(Color.parseColor("#d71313"));
                    tv_result2.setTextColor(Color.parseColor("#d71313"));
                    tv_result1.setText("请输入场所名称！");
                    tv_result2.setText("请输入场所名称！");
                } else if ("".equals(ed_s.getText().toString())) {
                    tv_result1.setTextColor(Color.parseColor("#d71313"));
                    tv_result2.setTextColor(Color.parseColor("#d71313"));
                    tv_result1.setText("请输入计算单元保护面积！");
                    tv_result2.setText("请输入计算单元保护面积！");
                } else if (Utils.had(ed_place.getText().toString(), a)) {
                    tv_result1.setTextColor(Color.parseColor("#04a300"));
                    tv_result2.setTextColor(Color.parseColor("#04a300"));
                    tv_result1.setText("需要单具4A灭火级别的灭火器" + (int) (Math.ceil(1.3 * Double.parseDouble(ed_s.getText().toString()) / 40 / 4)) + "具(间距不大于15米)高危险级场所");
                    tv_result2.setText("需要单具114B灭火级别的灭火器" + (int) (Math.ceil(1.3 * Double.parseDouble(ed_s.getText().toString()) / 0.5 / 144)) + "具(间距不大于9米)高危险级场所");
                } else if (Utils.had(ed_place.getText().toString(), c)) {
                    tv_result1.setTextColor(Color.parseColor("#04a300"));
                    tv_result2.setTextColor(Color.parseColor("#04a300"));
                    tv_result1.setText("需要单具3A灭火级别的灭火器" + (int) (Math.ceil(1 * Double.parseDouble(ed_s.getText().toString()) / 60 / 3)) + "具(间距不大于20米)中危险级场所");
                    tv_result2.setText("需要单具89B灭火级别的灭火器" + (int) (Math.ceil(1 * Double.parseDouble(ed_s.getText().toString()) / 1 / 89)) + "具(间距不大于12米)中危险级场所");
                } else if (Utils.had(ed_place.getText().toString(), e)) {
                    tv_result1.setTextColor(Color.parseColor("#04a300"));
                    tv_result2.setTextColor(Color.parseColor("#04a300"));
                    tv_result1.setText("需要单具4A灭火级别的灭火器" + (int) (Math.ceil(0.3 * Double.parseDouble(ed_s.getText().toString()) / 40 / 4)) + "具(间距不大于15米)高危险级场所");
                    tv_result2.setText("需要单具114B灭火级别的灭火器" + (int) (Math.ceil(0.3 * Double.parseDouble(ed_s.getText().toString()) / 0.5 / 144)) + "具(间距不大于9米)高危险级场所");
                } else if (Utils.had(ed_place.getText().toString(), b)) {
                    tv_result1.setTextColor(Color.parseColor("#04a300"));
                    tv_result2.setTextColor(Color.parseColor("#04a300"));
                    tv_result1.setText("需要单具4A灭火级别的灭火器" + (int) (Math.ceil(1 * Double.parseDouble(ed_s.getText().toString()) / 40 / 4)) + "具(间距不大于15米)高危险级场所");
                    tv_result2.setText("需要单具114B灭火级别的灭火器" + (int) (Math.ceil(1 * Double.parseDouble(ed_s.getText().toString()) / 0.5 / 114)) + "具(间距不大于9米)高危险级场所");
                } else if (Utils.had(ed_place.getText().toString(), d)) {
                    tv_result1.setTextColor(Color.parseColor("#04a300"));
                    tv_result2.setTextColor(Color.parseColor("#04a300"));
                    tv_result1.setText("需要单具2A灭火级别的灭火器" + (int) (Math.ceil(1 * Double.parseDouble(ed_s.getText().toString()) / 100 / 2)) + "具(间距不大于25米)高危险级场所");
                    tv_result2.setText("需要单具34B灭火级别的灭火器" + (int) (Math.ceil(1 * Double.parseDouble(ed_s.getText().toString()) / 1.5 / 34)) + "具(间距不大于15米)高危险级场所");
                } else if (Utils.had(ed_place.getText().toString(), f)) {
                    tv_result1.setTextColor(Color.parseColor("#04a300"));
                    tv_result2.setTextColor(Color.parseColor("#04a300"));
                    tv_result1.setText("需要单具3A灭火级别的灭火器" + (int) (Math.ceil(0.3 * Double.parseDouble(ed_s.getText().toString()) / 60 / 3)) + "具(间距不大于20米)高危险级场所");
                    tv_result2.setText("需要单具89B灭火级别的灭火器" + (int) (Math.ceil(0.3 * Double.parseDouble(ed_s.getText().toString()) / 1 / 89)) + "具(间距不大于12米)高危险级场所");
                } else {
                    tv_result1.setTextColor(Color.parseColor("#d71313"));
                    tv_result2.setTextColor(Color.parseColor("#d71313"));
                    tv_result1.setText("抱歉，没有找到该关键词的场所名称，请换一个关键词重新查询试试");
                    tv_result2.setText("抱歉，没有找到该关键词的场所名称，请换一个关键词重新查询试试");
                }
            }
        });
        b_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_note.setVisibility(View.VISIBLE);
            }
        });
        iv_note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv_note.setVisibility(View.GONE);
            }
        });
    }

    private void initView() {
        //        设置背景
        View v = findViewById(R.id.RL);
        v.getBackground().setAlpha(222);
//        初始化布局
        ed_place=(EditText)findViewById(R.id.ed_place);
        ed_s=(EditText)findViewById(R.id.ed_s);
        bt_result=(Button)findViewById(R.id.bt_result);
        tv_result1=(TextView)findViewById(R.id.tv_result1);
        tv_result2=(TextView)findViewById(R.id.tv_result2);
        spinner=(ListView)findViewById(R.id.spinner);
        b_note=(Button)findViewById(R.id.b_note);
        iv_note=(ImageView)findViewById(R.id.iv_note);
        spinner.setVisibility(View.GONE);
    }
}
