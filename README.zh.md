<div align="center">
    <img src="assets/imgs/logo.png" alt="logo" width=150 height=150 />
</div>
<h1 align="center">ECharts Java</h1>
<p align="center">
    <em>"We bring better visualization into Java with ECharts"</em>
</p>
<p align="center">
    <a href="https://github.com/ECharts-Java/ECharts-Java/actions">
        <img src="https://github.com/ECharts-Java/ECharts-Java/actions/workflows/maven.yml/badge.svg" alt="Github Actions Status">
    </a>
    <a href="https://github.com/pyecharts/pyecharts/pulls">
        <img src="https://img.shields.io/badge/contributions-welcome-brightgreen.svg?style=flat" alt="Contributions welcome">
    </a>
    <!-- <a href="https://codecov.io/gh/ECharts-Java/ECharts-Java">
        <img src="https://codecov.io/gh/ECharts-Java/ECharts-Java/branch/dev/graph/badge.svg?token=V1N6AQ0EA1"/>
    </a> -->
    <a href="https://opensource.org/licenses/Apache-2.0">
        <img src="https://img.shields.io/badge/License-Apache_2.0-blue.svg" alt="License">
    </a>
    <a href="https://maven-badges.herokuapp.com/maven-central/org.icepear.echarts/echarts-java">
        <img src="https://maven-badges.herokuapp.com/maven-central/org.icepear.echarts/echarts-java/badge.svg" alt="Maven Central">
    </a>
</p>

[English README](README.md)

[å®æ¹ææ¡£](https://echarts.icepear.org/#/zh-cn/)

## ð ç®ä»

ECharts Java æ¯ä¸æ¬¾åºäº [Apache ECharts](https://echarts.apache.org/en/index.html) çï¼ç®æä½å¨é¢çæ°æ®å¯è§ååºãï¼ç°æ¯æ Apache ECharts 5.x çæ¬ï¼ã

è®ºç®ææ§ï¼ECharts Java éæ°è®¾è®¡äºä¸ç³»ååç»å¾æå³çæ¥å£ï¼ä½¿å¾ç»å¾è¿ç¨æ´å ç¬¦åç´è§åå¸¸çãåæ¶ï¼ç±äº Apache ECharts çæ¥å£è¿äºå¤æåç¹çï¼æä»¬å¨ ECharts Java çå¾è¡¨ API ä¸­ç®åäºé¨ååæ¬çæ¥å£è®¾è®¡ã

è®ºå¨é¢ï¼ECharts Java ä¿çäº Apache ECharts âä¸åç Optionâçè®¾è®¡çå¿µãå æ­¤ï¼é¤äºéæ°è®¾è®¡çå¾è¡¨ API ä»¥å¤ï¼æä»¬è¿ä¿çäºèªå®ä¹ Option å¯¹è±¡çæ¹æ³ãç¨æ·å¯ä»¥ä»é¶å¼å§ï¼æç§ ECharts ç Option ææ¡£ï¼èªå®ä¹ä»»ä½ ECharts æ¯æç Optionãé¤æ­¤ä»¥å¤ï¼æä»¬è¿ä½¿ç¨é¾å¼æ¹æ³è°ç¨ç­æ¹å¼ï¼ä½¿å¾ Java å¼åèå¨æå»º Option çè¿ç¨ä¸­æ´å æ¹ä¾¿ã

## ð  ç¹æ§

- ç®åãæ´æ´ãé«åº¦ç»ç»åç API æ¥å£ï¼æ¯æé¾å¼è°ç¨
- å®æ´ä¿å­ Apache ECharts çåè½
- å¿«ééæè³å½åæµè¡ç Web æ¡æ¶
- çµæ´»çå¯¼åºæ ¼å¼ï¼æ¯æ HTMLï¼PNG å JSON
- å®æ´ãè¯¦ç»çææ¡£åç¤ºä¾åº

## ð¬ å®è£

Maven é¡¹ç®:

```xml
// pom.xml
<dependency>
  <groupId>org.icepear.echarts</groupId>
  <artifactId>echarts-java</artifactId>
  <version>1.0.4</version>
</dependency>
```

Gradle é¡¹ç®:

```
implementation 'org.icepear.echarts:echarts-java:1.0.4'
```

å¦æä½ ä½¿ç¨çæ¯å¶ä»é¡¹ç®ï¼è¯·åé[è¿é](https://search.maven.org/artifact/org.icepear.echarts/echarts-java/1.0.4/jar)ã

## ð­ ä½¿ç¨

### çæ HTML åä¸è½½å¾ç

```java
public static void main(String[] args) {
// All methods in EChart Java supports method chaining
    Bar bar = new Bar()
              .setLegend()
              .setTooltip("item")
              .addXAxis(new String[] { "Matcha Latte", "Milk Tea", "Cheese Cocoa", "Walnut Brownie" })
              .addYAxis()
              .addSeries("2015", new Number[] { 43.3, 83.1, 86.4, 72.4 })
              .addSeries("2016", new Number[] { 85.8, 73.4, 65.2, 53.9 })
              .addSeries("2017", new Number[] { 93.7, 55.1, 82.5, 39.1 });
    Engine engine = new Engine();
    // The render method will generate our EChart into a HTML file saved locally in the current directory.
    // The name of the HTML can also be set by the first parameter of the function.
    engine.render("index.html", bar);
}
```

<img src="assets/imgs/multibar-render.gif" alt="multi-bar-render" style="width:85%;" />

### çæ Option å¯¹è±¡åå¯¹åºç JSON ç»æ

```java
public static void main(String[] args) {
    Line lineChart = new Line()
                .addXAxis(new CategoryAxis()
                        .setData(new String[] { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" })
                        .setBoundaryGap(false))
                .addYAxis()
                .addSeries(new LineSeries()
                        .setData(new Number[] { 820, 932, 901, 934, 1290, 1330, 1320 })
                        .setAreaStyle(new LineAreaStyle()));
    Engine engine = new Engine();
    // It is recommended that you can  get the serialized version of Option in the representation of JSON, which can be used directly in the template or in the RESTful APIs.
    String jsonStr = engine.renderJsonOption(lineChart);
}
```

çæç JSON å¯¹è±¡å¦ä¸ï¼

```json
{
  "xAxis": [
    {
      "type": "category",
      "data": ["Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"],
      "boundaryGap": false
    }
  ],
  "yAxis": [{ "type": "value" }],
  "series": [
    {
      "type": "line",
      "data": [820, 932, 901, 934, 1290, 1330, 1320],
      "areaStyle": {}
    }
  ]
}
```

### éæè³ Spring Boot åºç¨

<img src="assets/imgs/line-renderHtml.gif" alt="spring-boot-integration" style="width:75%;" />

è¯¦ç»åå®¹è¯·åéï¼[ææ¡£](https://echarts.icepear.org/#/zh-cn/) ï¼[ä»£ç ä»åº](https://github.com/incandescentxxc/ECharts-Java-Examples)ã

## ð ç¤ºä¾

<p float="center">
  <img src="assets/imgs/stacked-line.jpg" width="32%" />
  <img src="assets/imgs/stacked-area.jpg" width="32%" /> 
  <img src="assets/imgs/multiple-series-bar.jpg" width="32%" />
  <img src="assets/imgs/horizontal-stacked-bar.jpg" width="32%" /> 
  <img src="assets/imgs/basic-scatter.jpg" width="32%" />
  <!-- <img src="assets/imgs/basic-boxplot.jpg" width="32%" />  -->
  <img src="assets/imgs/basic-candlestick.jpg" width="32%" /> 
  <img src="assets/imgs/basic-heatmap.jpg" width="32%" /> 
  <img src="assets/imgs/basic-polar-line.jpg" width="32%" /> 
  <img src="assets/imgs/tangential-polar-bar.jpg" width="32%" /> 
  <img src="assets/imgs/basic-polar-scatter.jpg" width="32%" /> 
  <img src="assets/imgs/basic-radar.jpg" width="32%" /> 
  <img src="assets/imgs/basic-parallel.jpg" width="32%" />
  <img src="assets/imgs/basic-theme-river.jpg" width="32%" />
  <img src="assets/imgs/basic-rose.jpg" width="32%" />
  <img src="assets/imgs/nested-pie.jpg" width="32%" />
  <img src="assets/imgs/circular-layout-graph.jpg" width="32%" />
  <img src="assets/imgs/hide-overlapped-label-graph.jpg" width="32%" />
  <img src="assets/imgs/basic-sankey.jpg" width="32%" />
  <img src="assets/imgs/basic-funnel.jpg" width="32%" />
  <img src="assets/imgs/basic-sunburst.jpg" width="32%" />
  <img src="assets/imgs/animation-gauge.jpg" width="32%" /> 
</p>

## ð¡ ä½è

- [@IcePear-Jzx](https://github.com/IcePear-Jzx)
- [@incandescentxxc](https://github.com/incandescentxxc)

æ¬¢è¿å¤§å®¶ç§¯ææ issueï¼forkï¼åå¶ä»è´¡ç®ï¼

## ð é¸£è°¢

- æ¬é¡¹ç®çµææ¥æºäº[å¡èåºæ¢éå¤§å­¦](https://www.cmu.edu/)çè¯¾ç¨ï¼[Principles of Software Construction Objects, Design, and Concurrency](https://cmu-17-214.github.io/f2021/)ãæä»¬å¨æ­¤çè¯å°æè°¢ [Christian](https://www.cs.cmu.edu/~ckaestne/) å [Vincent](https://vhellendoorn.github.io/) å¨ 2021 ç§å¤©ææçè¿é¨è¯¾ã

- æ¬é¡¹ç®åæ ·ä¹åå° [pyecharts](https://github.com/pyecharts/pyecharts) å [go-echarts](https://github.com/go-echarts/go-echarts) çå¯åã

## ð å¼æºåè®®

æ¬é¡¹ç®éµå¾ª [Apache License 2.0](LICENSE) å¼æºåè®®ã
