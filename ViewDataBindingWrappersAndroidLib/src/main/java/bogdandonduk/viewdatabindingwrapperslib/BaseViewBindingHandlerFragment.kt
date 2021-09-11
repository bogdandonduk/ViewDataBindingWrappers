package bogdandonduk.viewdatabindingwrapperslib

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

open class BaseViewBindingHandlerFragment<ViewBindingType : ViewBinding>(
    var viewBindingInflation: (layoutInflater: LayoutInflater, parent: ViewGroup?) -> ViewBindingType
): Fragment(), ViewBindingHandler<ViewBindingType> {
    override lateinit var viewBinding: ViewBindingType

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = viewBindingInflation.invoke(layoutInflater, container)

        return viewBinding.root
    }
}