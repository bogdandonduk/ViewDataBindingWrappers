package bogdandonduk.viewdatabindingwrapperslib

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

/** Extend this class for automatic viewBinding property initialization */

open class BaseViewBindingHandlerActivity<ViewBindingType : ViewBinding>(
    var viewBindingInflation: (layoutInflater: LayoutInflater) -> ViewBindingType
): AppCompatActivity(), ViewBindingHandler<ViewBindingType> {
    override lateinit var viewBinding: ViewBindingType

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = viewBindingInflation.invoke(layoutInflater)

        setContentView(viewBinding.root)
    }
}