# GradlePlugin
自定义Gradle插件Demo

1.执行./gradlew tasks 查看当前可用的task

2.在neo分组下面有两个task，分别是helloPluginTask、printPerson

3.执行./gradlew printPerson 执行自定义插件的task

4.如果想要修改HelloPlugin插件的内容，修改完后需要上传到本地maven，执行./gradlew app:publish
