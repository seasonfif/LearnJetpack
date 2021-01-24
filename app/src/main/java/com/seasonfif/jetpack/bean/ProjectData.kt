package com.seasonfif.jetpack.bean

val m = """
{
  "curPage": 2,
  "offset": 15,
  "over": false,
  "pageCount": 16,
  "size": 15,
  "total": 239,
  "datas": [
    {
      "apkLink": "",
      "audit": 1,
      "author": "songmao123",
      "canEdit": false,
      "chapterId": 294,
      "chapterName": "完整项目",
      "collect": false,
      "courseId": 13,
      "desc": "本项的数据使用的是鸿洋大神的玩Android开放API。项目整体使用的是Flutter编写，采用的是Redux架构。",
      "descMd": "",
      "envelopePic": "https://www.wanandroid.com/blogimgs/cf19f8c6-7d12-484d-82c0-ad177eaba276.png",
      "fresh": false,
      "host": "",
      "id": 16700,
      "link": "https://www.wanandroid.com/blog/show/2876",
      "niceDate": "2021-01-01 00:24",
      "niceShareDate": "2021-01-01 00:24",
      "origin": "",
      "prefix": "",
      "projectLink": "https://github.com/songmao123/flutter_wanandroid_redux",
      "publishTime": 1609431870000,
      "realSuperChapterId": 293,
      "selfVisible": 0,
      "shareDate": 1609431870000,
      "shareUser": "",
      "superChapterId": 294,
      "superChapterName": "开源项目主Tab",
      "tags": [
        {
          "name": "项目",
          "url": "/project/list/1?cid=294"
        }
      ],
      "title": "Flutter(Redux)版玩安卓客户端",
      "type": 0,
      "userId": -1,
      "visible": 1,
      "zan": 0
    },
    {
      "apkLink": "",
      "audit": 1,
      "author": "wangjianxiandev",
      "canEdit": false,
      "chapterId": 294,
      "chapterName": "完整项目",
      "collect": false,
      "courseId": 13,
      "desc": "根据鸿神提供的WanAndroid开放Api以及总结网上的优秀项目来制作的WanAndroidApp,使用Java语言开发，基于Material Design+AndroidX + MVP + RxJava + Retrofit等优秀的开源框架，这个项目是自己实习后第一次有搭建架构的思路，实现的一个尽可能体验较佳的App，不足之处请大家多多指教\r\n",
      "descMd": "",
      "envelopePic": "https://www.wanandroid.com/blogimgs/158583cc-944b-41e9-af50-046f6d504f40.png",
      "fresh": false,
      "host": "",
      "id": 16682,
      "link": "https://www.wanandroid.com/blog/show/2870",
      "niceDate": "2020-12-30 23:43",
      "niceShareDate": "2020-12-30 23:43",
      "origin": "",
      "prefix": "",
      "projectLink": "https://github.com/wangjianxiandev/WanAndroidMvp",
      "publishTime": 1609343039000,
      "realSuperChapterId": 293,
      "selfVisible": 0,
      "shareDate": 1609343039000,
      "shareUser": "",
      "superChapterId": 294,
      "superChapterName": "开源项目主Tab",
      "tags": [
        {
          "name": "项目",
          "url": "/project/list/1?cid=294"
        }
      ],
      "title": "WanAndroid app（使用Java语言开发，基于Material Design+AndroidX + MVP + RxJava + Retrofit）",
      "type": 0,
      "userId": -1,
      "visible": 1,
      "zan": 0
    }
  ]
}
"""


data class ProjectData(
    var curPage: Int,
    var datas: List<ProjectItem>,
    var offset: Int,
    var over: Boolean,
    var pageCount: Int,
    var size: Int,
    var total: Int
)

data class ProjectItem(
    var apkLink: String,
    var audit: Int,
    var author: String,
    var canEdit: Boolean,
    var chapterId: Int,
    var chapterName: String,
    var collect: Boolean,
    var courseId: Int,
    var desc: String,
    var descMd: String,
    var envelopePic: String,
    var fresh: Boolean,
    var host: String,
    var id: Int,
    var link: String,
    var niceDate: String,
    var niceShareDate: String,
    var origin: String,
    var prefix: String,
    var projectLink: String,
    var publishTime: Long,
    var realSuperChapterId: Int,
    var selfVisible: Int,
    var shareDate: Long,
    var shareUser: String,
    var superChapterId: Int,
    var superChapterName: String,
    var tags: List<Tag>,
    var title: String,
    var type: Int,
    var userId: Int,
    var visible: Int,
    var zan: Int
)

data class Tag(
    var name: String,
    var url: String
)