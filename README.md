

# ViewDataBindingWrappers

  Collection of wrapper interfaces and base classes to simplify your view and data binding initialization.
  
## Include in your project  
**Gradle dependency**  
  
Add this in your **app**-level **build.gradle** file:  
```groovy
dependencies {  
	...  
  
	def latest_version_tag = 2.0.2
	implementation "com.github.bogdandonduk:ViewDataBindingWrappers:$latest_version_tag"  
  
	...  
}  
```  
You can always find the **latest_version_tag** [here](https://github.com/bogdandonduk/ViewDataBindingWrappers/releases).  
  
Also make sure you have this repository in your **project**-level **build.gradle** file:  
```groovy  
allprojects {  
	repositories {  
		...  
  
		maven { url 'https://jitpack.io' }  
	}  
}  
```  

# Examples of usage
```kotlin 
  // extend one of base classes and provide viewBinding inflation lambda function to have viewBinding property automatically initialized
  
  class MainActivity : BaseViewBindingHandlerActivity<ActivityMainBinding>(
	  viewBindingInflation = { layoutInflater: LayoutInflater ->
		  ActivityMainBinding.inflate(layoutInflater)
	  }
  ) {
    override fun onCreate(savedInstanceState: Bundle?) {
	    ...
	    
	    viewBinding.myMainTextView.setTextColor(Color.GREEN)
	    // now you have viewBinding property automatically initialized
    }
  }

```
