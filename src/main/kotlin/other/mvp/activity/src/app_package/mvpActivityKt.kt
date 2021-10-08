package other.mvp.activity.src.app_package


/**
 *  @Author Neo
 *  @Date   2021/6/7
 *  @Env    Viicare-Neo
 *  @Description  mvpActivityKt
 */
fun mvpActivityKt(
    applicationPackage: String?,
    activityClass: String,
    layoutName: String,
    packageName: String
) = """
package $packageName
import  ${applicationPackage}.R
import android.content.Context
import android.content.Intent
import android.os.Bundle


class ${activityClass} : BaseA ()  {

  companion object {
        fun EnterThis(context: Context, string: String = "", int: Int = 0) {
            var intent = Intent(context,${activityClass}().javaClass)
            intent.putExtra("strInfo", string)
            intent.putExtra("Type", int)
            context.startActivity(intent)
        }
    }
    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.${layoutName})
          /*    intent?.apply {
                StrValue = this.getStringExtra("strInfo")
                Type = this.getIntExtra("ShowType", 1)
                objContacts = this.getSerializableExtra("ObjInfo") as MediaListM.DataBean?
            }*/
         initView()
        initData()
        getData()
    }

    private fun initView() {
//        initTitle("xxx")

    }

    private fun initData() {


    }

    private fun getData() {

    }

 
}
"""